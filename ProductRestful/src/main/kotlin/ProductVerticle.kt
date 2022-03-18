import io.vertx.core.AbstractVerticle
import io.vertx.ext.web.RoutingContext
import com.google.gson.Gson
import io.vertx.ext.web.Router
import io.vertx.core.AsyncResult
import io.vertx.core.Promise
import io.vertx.core.http.HttpServer
import java.util.ArrayList

class ProductVerticle : AbstractVerticle() {
    private var products = ArrayList<Product>()
    fun createExampleData() {
        var p1 = Product(1, "Coca", 2, 15f)
        var p2 = Product(2, "Pepsi", 5, 20f)
        var p3 = Product(3, "Aqua", 3, 25f)
        var p4 = Product(4, "Sting", 7, 30f)
        var p5 = Product(5, "Redbull", 3, 19f)
        products.add(p1)
        products.add(p2)
        products.add(p3)
        products.add(p4)
        products.add(p5)
    }

    fun getAllProducts(routingContext: RoutingContext) {
        var response = routingContext.response()
        response.putHeader("content-type", "application/json;charset=UTF-8")
        var gson = Gson()
        response.end(gson.toJson(products))
    }
    override fun start(startPromise: Promise<Void>?) {
        createExampleData()
        var router = Router.router(vertx)
        router["/api/products"].handler {
                routingContext: RoutingContext ->
                getAllProducts(routingContext) }
        vertx.createHttpServer()
            .requestHandler(router)
            .listen(config().getInteger("http.port", 8080))
            {
                result: AsyncResult<HttpServer?> ->
                if (result.succeeded()) {
                    startPromise!!.complete()
                } else {
                    startPromise!!.fail(result.cause())
                }
            }
    }
}