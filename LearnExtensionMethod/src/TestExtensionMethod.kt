fun Int.Plus(a:Int):Int
{
    return this+a
}
fun Int.CheckPrimeNumber():Boolean
{
    var count=0
    for(i in 1..this)
    {
        if(this%i==0)
            count++
    }
    return count==2
}
fun main(args: Array<String>) {
    var t=5.Plus(9)
    println("t=$t")
    var x1=9
    var x2=10
    var x3=x1.Plus(x2)
    println("x3=$x3")

    var a=7
    if(a.CheckPrimeNumber()==true)
    {
        println("$a is prime")
    }
    else
    {
        println("$a is not prime")
    }
    var b=9
    if(b.CheckPrimeNumber()==true)
    {
        println("$b is prime")
    }
    else
    {
        println("$b is not prime")
    }
}
