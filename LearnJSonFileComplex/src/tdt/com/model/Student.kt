package tdt.com.model

class Student {
    public var Id:String? = null
        get() {return field}
        set(value) {field=value}
    public var Name:String?=null
        get() {return field}
        set(value) {field=value}
    public var Courses:MutableList<Course>?=null
        get() {return field}
        set(value) {field=value}
    constructor()
    {
        Courses= mutableListOf()
    }
    constructor(Id: String?, Name: String?) {
        this.Id = Id
        this.Name = Name
        Courses= mutableListOf()
    }
    //Add new course for student
    fun addCourse(course:Course)
    {
        if(Courses!=null)
            Courses!!.add(course)
    }
    //print all student's courses
    fun printAllCourse()
    {
        if(Courses==null)return
        for (course in Courses!!)
        {
            println(course)
        }
    }
    override fun toString(): String {
        return "$Id\t$Name"
    }
}