fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double=0.0
    var c:Double=0.0
    println("Welcome to Second-Degree Equation!")
    println("Input a:")
    a= readLine()!!.toDouble()
    println("Input b:")
    b=readLine()!!.toDouble()
    println("Input c:")
    c=readLine()!!.toDouble()
    if(a==0.0)
    {
        if(b==0.0 && c==0.0)
            println("Infinite solutions")
        else if(b==0.0 && c!=0.0)
            println("No solutions")
        else
            println("X="+(-b/c))
    }
    else
    {
        val delta:Double=Math.pow(b,2.0)-4*a*c
        if(delta<0)
            println("No solutions")
        else if(delta==0.0)
        {
            var x:Double=-b/(2*a)
            println("Double root x1=x2=$x")
        }
        else
        {
            var x1:Double=(b-Math.sqrt(delta))/(2*a)
            var x2:Double=(b+Math.sqrt(delta))/(2*a)
            println("x1=$x1")
            println("x2=$x2")
        }
    }
}