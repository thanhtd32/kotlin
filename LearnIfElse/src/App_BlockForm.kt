fun main(args: Array<String>) {
    var a:Int=10
    var b:Int=15
    var max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max = "+max)
}