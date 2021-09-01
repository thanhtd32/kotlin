import java.util.*

fun Student.Age():Int
{
    var cal=Calendar.getInstance()
    var currentYear=cal.get(Calendar.YEAR)
    cal.time=this.Birthday
    var yearBoy=cal.get(Calendar.YEAR)
    return currentYear-yearBoy+1
}
fun main(args: Array<String>) {
    var yob=Calendar.getInstance()
    yob.set(Calendar.YEAR,1998)
    yob.set(Calendar.MONTH,2)
    yob.set(Calendar.DAY_OF_MONTH,15)
    var st=Student(100,"Mr Peter",yob.time)
    var age=st.Age()
    println("Code of Student=${st.Code}")
    println("Name of Student=${st.Name}")
    println("Birthday of Student=${st.Birthday}")
    println("Age of Student=${st.Age()}")
}
