fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double=0.0
    println("Enter a:")
    var s= readLine()
    if(s!=null)
        a=s.toDouble()
    println("Enter b:")
    s= readLine()
    if(s!=null)
        b=s.toDouble()
    if(a==0.0 && b==0.0)
    {
        println("Infinite solutions")
    }
    else if(a==0.0 && b!=0.0)
    {
        println("No solutions")
    }
    else
    {
        var x=-b/a
        println("x="+x)
    }
}