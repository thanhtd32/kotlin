fun main(args: Array<String>) {
    var x:Int
    println("Input x:")
    x= readLine()!!.toInt()
    when
    {
        x%2==0-> println("$x is the even number")
        x%2!=0->println("$x is the odd number")
    }
}
