fun main(args: Array<String>) {
    var sum:Int=0
    var n:Int=10
    for (i in 2 .. n step 2)
        sum+=i
    println("Sum of even numbers=$sum")
}