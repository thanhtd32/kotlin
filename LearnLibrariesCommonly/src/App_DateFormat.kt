import java.util.Date
import java.util.Calendar
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    //Get the Calendar object (current date)
    var cal:Calendar=Calendar.getInstance()
    //Get year from cal object
    var year:Int=cal.get(Calendar.YEAR)
    //Get month from cal object
    var month:Int=cal.get(Calendar.MONTH)
    //Get day of the month from cal object
    var day:Int=cal.get(Calendar.DAY_OF_MONTH)
    println("Year=$year")
    println("Month=$month")
    println("Day=$day")

    //Get DateTime from cal object
    var date:Date=cal.time
    //Create SimpleDateFormat object
    var sdf=SimpleDateFormat("dd/MM/yyyy")
    //print date with format
    println(sdf.format(date))
    var sdf2=SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa")
    println(sdf2.format(date))
}