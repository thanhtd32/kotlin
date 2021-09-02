package tdt.com.test

import tdt.com.io.XMLFileFactory
import tdt.com.model.Product

fun main(args: Array<String>) {
    var path="d:/Productdata.xml"
    var xmlff=XMLFileFactory()
    var data:MutableList<Product>
    data=xmlff.ReadFile(path)
    for (product in data)
        println(product)
}
