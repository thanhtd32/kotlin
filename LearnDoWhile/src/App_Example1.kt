fun main(args: Array<String>) {
    var n:Int = 5
    var factorial:Int=1
    var i:Int = 1
    do
    {
        factorial *= i
        i++
    }while (i<=n)
    println("$n! =$factorial")
}
