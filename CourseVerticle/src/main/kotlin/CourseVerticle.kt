import com.google.gson.Gson
import io.vertx.core.AbstractVerticle
import io.vertx.core.AsyncResult
import io.vertx.core.Promise
import io.vertx.core.http.HttpServer
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

class CourseVerticle : AbstractVerticle() {
    override fun start(startPromise: Promise<Void>?) {
        var router = Router.router(vertx)
        router["/api/courses"].handler {
                routingContext: RoutingContext? ->
                listOfCourses(routingContext!!)
        }
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
    fun listOfCourses(routingContext: RoutingContext) {
        var courses = arrayOf(
            "Basic C#",
            "Basic Kotlin",
            "Advanced Java",
            "Kotlin Android"
        )
        var gson = Gson()
        routingContext.response()
            .putHeader("content-type", "application/json;charset=utf-8")
            .end(gson.toJson(courses))
    }
}
