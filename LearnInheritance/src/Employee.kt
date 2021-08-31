open abstract class Employee {
    var Code:Int=0
        get() {return field}
        set(value) {field=value}
    var Name:String=""
        get() {return field}
        set(value) {field=value}
    constructor()
    constructor(code:Int,name:String)
    {
        this.Code=code
        this.Name=name
    }
    abstract fun calculateSalary(dayofWork:Int):Double
    override fun toString(): String {
        return "$Code-$Name"
    }
}
