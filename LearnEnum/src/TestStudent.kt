fun main(args: Array<String>) {
    var st1=Student(100,"Mr John",4.0)
    println("Code=${st1.Code}")
    println("Name=${st1.Name}")
    println("GPA=${st1.GPA}")
    println("Grade=${st1.getGrade()}")

    println("-----------------")

    var st2=Student()
    st2.Code=200
    st2.Name="Mr Peter"
    st2.GPA=2.0
    println("Code=${st2.Code}")
    println("Name=${st2.Name}")
    println("GPA=${st2.GPA}")
    println("Grade=${st2.getGrade()}")
}