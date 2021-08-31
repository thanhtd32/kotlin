class TemporaryEmployee:Employee {
    constructor():super()
    constructor(code:Int,name:String):super(code,name)
    {
    }
    override fun calculateSalary(dayofWork: Int): Double {
       return 100.0*dayofWork
    }
}