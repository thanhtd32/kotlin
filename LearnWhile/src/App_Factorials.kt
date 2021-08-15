fun main(args: Array<String>) {
    var factorial:Int=1
    var n:Int=5
    var i:Int = 1
    while (i <= n)
    {
        factorial *= i
        i++
    }
    println("$n! =$factorial")
}