package tdt.com.model

class Product {
    public var Code:Int=0
        get() {return field}
        set(value) {field=value}
    public var Name:String=""
        get() {return field}
        set(value) {field=value}
    public var UnitPrice:Double=0.0
        get() {return field}
        set(value) {field=value}
    constructor()
    constructor(code: Int, name: String,
                unitPrice: Double) {
        this.Code = code
        this.Name = name
        this.UnitPrice = unitPrice
    }
    override fun toString(): String {
        return "$Code\t$Name\t$UnitPrice"
    }
}