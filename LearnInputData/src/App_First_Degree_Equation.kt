fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double=0.0
    println("Input a:")
    var s= readLine()
    if(s!=null)
        a=s.toDouble()
    println("Input b:")
    s= readLine()
    if(s!=null)
        b=s.toDouble()
    if(a==0.0 && b==0.0)
    {
        println("Infinite!!!")
    }
    else if(a==0.0 && b!=0.0)
    {
        println("Unknown!!!")
    }
    else
    {
        var x=-b/a
        println("x="+x)
    }
}