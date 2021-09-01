class Fraction :Cloneable {
    var Numerator:Int=1
        get() {return field}
        set(value) {field=value}
    var Denominator:Int=1
        get() {return field}
        set(value) {field=value}
    constructor(numerator: Int, denominator: Int) {
        this.Numerator =numerator
        this.Denominator = denominator
    }
    override fun toString(): String {
        return "$Numerator/$Denominator"
    }
    fun copy():Fraction
    {
        var f:Fraction=clone() as Fraction
        return f
    }
}