class Student {
    var Code:Int=0
    var Name:String=""
    var GPA:Double=0.0
    constructor()
    constructor(code:Int,name:String,gpa:Double)
    {
        Code=code
        Name=name
        GPA=gpa
    }
    public fun getGrade():Grade
    {
        if(GPA==4.0)return Grade.A
        if(GPA==3.0)return Grade.B
        if(GPA==2.0)return Grade.C
        if(GPA==1.0)return Grade.D
        if(GPA==0.0)return Grade.F
        return Grade.UNKNOW
    }
}