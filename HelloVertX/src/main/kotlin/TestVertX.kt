import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext

fun main(args: Array<String>) {
    var vertx = Vertx.vertx()

    var server = vertx.createHttpServer()
    var router = Router.router(vertx)
    router.route().handler { rc: RoutingContext ->
        var response = rc.response()
        response.putHeader("content-type", "text/html")
        response.end("Hello VertX Kotlin")
    }
    server.requestHandler(router).listen(8080)
}
