fun main(args: Array<String>) {
    //Constructor 0 arguments is called
    var p1=Product()
    p1.Id=100
    p1.Name="Coca"
    p1.UnitPrice=2.0
    //Constructor 2 arguments is called
    var p2=Product(200,"Pepsi")
    p2.UnitPrice=2.5
    //Constructor 3 arguments is called
    var p3=Product(300,"Sting",3.0)

    println("Details of object p1:")
    p1.printInfor()
    println("Details of object p2:")
    p2.printInfor()
    println("Details of object p3:")
    p3.printInfor()
    println("Details of object p3:")
    p3.printInfor(p3.Id,p3.Name,p3.UnitPrice)
}