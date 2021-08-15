fun main(args: Array<String>) {
    var percentage:Int=0
    var letterGrade:String=""
    var gpa:Double=0.0
    println("Enter Percentage:")
    percentage= readLine()!!.toInt()
    when(percentage)
    {
        in 90..100 ->
            {
                letterGrade="A"
                gpa=4.0
            }
        in 80..89  ->
            {
                letterGrade = "B"
                gpa = 3.0
            }
        in 70..79  ->
            {
                letterGrade="C"
                gpa=2.0
            }
        in 60..69  ->
            {
                letterGrade="D"
                gpa=1.0
            }
        in 0..59   ->
            {
                letterGrade="F"
                gpa=0.0
            }
        !in 0..100 ->
            println("Invalid Percentage")
    }
    println("Your result: $letterGrade ($gpa)")
}