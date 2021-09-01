package tdt.com.test

import tdt.com.io.TextFileFactory
import tdt.com.model.Product
var path="d:/Productdata.txt"
fun saveProduct()
{
    var data:MutableList<Product> = mutableListOf()
    var p1=Product(1,"Coca",15.5)
    data.add(p1)
    var p2=Product(2,"Sting",25.0)
    data.add(p2)
    var p3=Product(3,"Redbull",17.0)
    data.add(p3)
    var tff= TextFileFactory()
    var ret=tff.SaveFile(data,path)
    if(ret)
    {
        println("Save text file successfully")
    }
    else
    {
        println("Save text file failed")
    }
}
fun readProduct()
{
    var tff= TextFileFactory()
    var data:MutableList<Product> = tff.ReadFile(path)
    for (product in data)
        println(product)
}
fun main(args: Array<String>) {
    while(true)
    {
        println("1.Save Product into File")
        println("2.Open Product from File")
        println("3.Exit")
        println("Your choice:")
        var s:String?= readLine()
        if(s!=null)
        {
            if(s.equals("1"))
                saveProduct()
            else if(s.equals("2"))
                readProduct()
            else
                break
        }
    }
}
