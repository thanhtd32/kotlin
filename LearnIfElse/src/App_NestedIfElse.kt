fun main(args: Array<String>) {
    var score:Double=0.0;
    println("Enter Score:")
    var s:String?= readLine()
    if(s.isNullOrBlank()==false)
    {
        score=s.toDouble()
        if(score>=0 && score<=100)
        {
            if (score >= 65)
            {
                println("Pass")
            }
            else
            {
                println("Fail")
            }
        }
        else
        {
            println("You must enter value in [0...100]")
        }
    }
    else
    {
        println("Please Enter value")
    }
}