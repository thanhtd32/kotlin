fun main() {
    var value:Int
    println("Please enter a value[1..7]:")
    value= readLine()!!.toInt()
    when(value)
    {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid value")
    }
}