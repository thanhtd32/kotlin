class Student {
    //Declare 2 attributes for Student with default visibily modifier
    var code:Int=0
    var name:String=""
    constructor()
    {
        println("This is secondary constructor without arguments")
    }
    constructor(code:Int,name:String)
    {
        println("This is secondary constructor 2 arguments")
        this.code=code
        this.name=name
    }
}
