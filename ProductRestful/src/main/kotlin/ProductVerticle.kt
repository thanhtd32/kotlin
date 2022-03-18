import com.google.gson.Gson
import io.vertx.core.AbstractVerticle
import io.vertx.core.AsyncResult
import io.vertx.core.Promise
import io.vertx.core.http.HttpServer
import io.vertx.core.json.Json
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext


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
        router["/api/products"].handler(this::getAllProducts)
        router["/api/sortedproducts"].handler(this::getSortedProducts)
        router["/api/products/:id"].handler(this::getOneProduct)
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
    private fun getSortedProducts(routingContext: RoutingContext) {
        var response = routingContext.response()
        response.putHeader("content-type", "application/json;charset=UTF-8")
        //parameter taken from user
        val sort = routingContext.request().getParam("sort")
        if (sort == null) {
            //if no parameters are passed, it will give an error API
            routingContext.response().setStatusCode(400).end()
        }
        else
        {
            if (sort.equals("desc", ignoreCase = true)) {
                products.sortBy { x->x.unitPrice }
            }
            else
                products.sortByDescending { x->x.unitPrice }
            var gson = Gson()
            response.end(gson.toJson(products))
        }
    }

    //returns detailed information of a Product by Id
     fun getOneProduct(routingContext: RoutingContext) {
        var response = routingContext.response()
        response.putHeader("content-type",
            "application/json;charset=utf-8")
        //get input id from URL
        var sid = routingContext.request().getParam("id")
        if (sid == null) { // if id not exist, error message
            routingContext.response().setStatusCode(400).end()
        } else {
            //convert  id to int
            var id = sid.toInt()
            //find product by id
            var p = products.firstOrNull { x->x.id==id }
            var gson = Gson()
            if(p!=null)
                response.end(gson.toJson(p))
            else
                response.end("")
        }
    }
}