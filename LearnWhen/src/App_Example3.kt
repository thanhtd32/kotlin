fun main(args: Array<String>) {
    var month:Int=0
    println("Enter month:")
    month= readLine()!!.toInt()
    when(month)
    {
        1,2,3-> println("Month "+month+" belongs to quarter 1")
        4,5,6-> println("Month "+month+" belongs to quarter 2")
        7,8,9-> println("Month "+month+" belongs to quarter 3")
        10,11,12->println("Month "+month+" belongs to quarter 4")
        else-> println("Month "+month+" is not valid")
    }
}