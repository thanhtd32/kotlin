class Product {
    var id:Int = 0
    var name: String? = null
    var quantity:Int = 0
    var unitPrice:Float = 0f

    constructor() {}
    constructor(id: Int, name: String?,
                quantity: Int,
                unitPrice: Float) {
        this.id = id
        this.name = name
        this.quantity = quantity
        this.unitPrice = unitPrice
    }
}