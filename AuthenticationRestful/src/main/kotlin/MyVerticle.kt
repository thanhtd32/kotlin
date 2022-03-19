import com.google.gson.Gson
import io.vertx.core.AbstractVerticle
import io.vertx.core.AsyncResult
import io.vertx.core.Promise
import io.vertx.core.http.Cookie
import io.vertx.core.http.HttpServer
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.JWTOptions
import io.vertx.ext.auth.KeyStoreOptions
import io.vertx.ext.auth.jwt.JWTAuth
import io.vertx.ext.auth.jwt.JWTAuthOptions
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.BodyHandler
import io.vertx.ext.web.handler.JWTAuthHandler

class MyVerticle : AbstractVerticle() {
    override fun start(startPromise: Promise<Void>?) {
        var router = Router.router(vertx)
        var authConfig = JWTAuthOptions()
            .setKeyStore(
                KeyStoreOptions()
                    .setType("jceks")
                    .setPath("keys\\keystore.jceks")
                    .setPassword("secret")
            )
        var jwt = JWTAuth.create(
            vertx,
            authConfig)

        router.route("/api/*").handler(authHandler(jwt))
        router.get("/api/users").handler(this::listOfUsers)
        router.route("/api*").handler(BodyHandler.create());
        router.post("/api/login").handler { ctx->login(ctx,jwt)}
        vertx.createHttpServer()
            .requestHandler(router)
            .listen(config().getInteger("http.port", 8080))
            { result: AsyncResult<HttpServer?> ->
                if (result.succeeded()) {
                    startPromise!!.complete()
                } else {
                    startPromise!!.fail(result.cause())
                }
            }
    }
    fun authHandler(jwtAuth: JWTAuth): JWTAuthHandler {
        return JWTAuthHandler.create(jwtAuth, "/api/login")
    }
    fun login(context: RoutingContext, jwtAuth: JWTAuth) {
        try {
            var data = context.bodyAsJson
            var user=data.getString("user")
            var pwd=data.getString("pass")
            if (!(user.equals("admin") && pwd.equals("123"))) {
                return
            }
            val token = jwtAuth.generateToken(
                JsonObject(),
                JWTOptions().setExpiresInSeconds(60)
            )

            var cookie = Cookie.cookie("auth", token)
            cookie.setHttpOnly(true).setPath("/").encode()
            context.addCookie(cookie).response()
                .putHeader("content-type", "text/plain")
                .putHeader("Authorization", token)
                .end(token)
        } catch (ex: Exception) {
            context.response().setStatusCode(401)
                .putHeader("content-type", "application/json")
                .end(ex.message)
        }
    }
    fun listOfUsers(routingContext: RoutingContext) {
        var users = arrayOf("admin","user1","user2","user3")
        var gson = Gson()
        routingContext.response()
            .putHeader("content-type", "application/json;charset=utf-8")
            .end(gson.toJson(users))
    }
}