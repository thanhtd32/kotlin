fun main(args: Array<String>) {
    var x:Int=8
    var result=when(x)
    {
        in 1..10->x+100
        in 20..30->x-1000
        else -> x
    }
    println("Result=$result")
}
