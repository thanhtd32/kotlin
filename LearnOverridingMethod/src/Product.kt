class Product {
    public var Id:Int = 0
        set(value) {field=value}
        get() {return field}
    public var Name:String = ""
        set(value) {field=value}
        get() {return field}
    public var UnitPrice:Double=0.0
        set(value) {field=value}
        get() {return field}
    constructor()
    constructor(id:Int,name:String)
    {
        this.Id=id
        this.Name=name
    }
    constructor(id:Int,name:String,unitPrice:Double)
    {
        this.Id=id
        this.Name=name
        this.UnitPrice=unitPrice
    }
    fun printInfor()
    {
        println("Id = ${this.Id}")
        println("Name = ${this.Name}")
        println("UnitPrice = ${this.UnitPrice}")
    }
    fun printInfor(id:Int,name:String,price:Double)
    {
        println("Id = $id")
        println("Name = $name")
        println("UnitPrice = $price")
    }
}