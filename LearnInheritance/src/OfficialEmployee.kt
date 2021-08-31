class OfficialEmployee:Employee {
    constructor():super()
    constructor(code:Int,name:String):super(code,name)
    {
    }
    override fun calculateSalary(dayofWork: Int): Double {
        if(dayofWork>=22)
            return 5000.0
        return 5000.0-100*(22-dayofWork)
    }
}