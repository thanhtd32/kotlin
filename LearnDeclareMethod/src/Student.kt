class Student {
    private var code:Int=0
    private var name:String=""
    public var Code:Int
        get()
        {
            return this.code
        }
        set(value)
        {
            code=value
        }
    public var Name:String
        get()
        {
            return name
        }
        set(value)
        {
            name=value
        }
    constructor()
    {

    }
    constructor(code:Int,name:String)
    {
        this.code=code
        this.name=name
    }
    fun printInfor()
    {
        println("Details Of Information:")
        println("Code= "+code)
        println("Name= "+name)
    }
    fun details():String
    {
        var s="Details of Information:"
        s=s.plus("\nCode="+code)
        s=s.plus("\n")
        s=s.plus("Name="+name)
        return s
    }
    override fun toString(): String {
        var s="Details of Information:"
        s=s.plus("\nCode="+code)
        s=s.plus("\n")
        s=s.plus("Name="+name)
        return s
    }
}
