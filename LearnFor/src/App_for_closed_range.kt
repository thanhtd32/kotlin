fun main(args: Array<String>) {
    var factorial:Int=1
    val n:Int=5
    for (i in 1..n)
    {
        factorial *= i
    }
    println("$n!=$factorial")
}