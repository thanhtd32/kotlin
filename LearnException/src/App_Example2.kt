fun divide(a:Int,b:Int):Int
{
    if(b==0)
        throw Exception("Denominator =0")
    return a/b
}
fun main(args: Array<String>) {
    try {
        divide(5, 0)
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    println("Good Bye!")
}
