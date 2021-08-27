class Student {
    //declare attributies
    private var code:Int=0
    private var name:String=""
    //declare Code property for code attribute
    public var Code:Int
        get()
        {
            //retrieve the data of the attribute
            return this.code
        }
        set(value)
        {
            //change attribute data
            this.code=value
        }
    //declare Name property for name attribute
    public var Name:String
        get()
        {
            return this.name
        }
        set(value)
        {
            this.name=value
        }
    constructor()
    {
    }
    constructor(code:Int,name:String)
    {
        this.code=code
        this.name=name
    }
}
