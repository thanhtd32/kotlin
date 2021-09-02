package tdt.com.test

import tdt.com.io.XMLFileFactory
import tdt.com.model.Product

fun main(args: Array<String>) {
    var data:MutableList<Product> = mutableListOf()
    var product1=Product(1,"Coca cola",15.5)
    data.add(product1)
    var product2=Product(2,"Sting",25.0)
    data.add(product2)
    var product3=Product(3,"Redbull",17.0)
    data.add(product3)
    var xmlff=XMLFileFactory()
    var ret=xmlff.SaveFile(data,"d:/Productdata.xml")
    if(ret)
    {
        println("Save text file successfully")
    }
    else
    {
        println("Save text file failed")
    }
}
