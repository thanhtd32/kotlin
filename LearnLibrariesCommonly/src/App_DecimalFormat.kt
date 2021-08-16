import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main(args: Array<String>) {
    var x:Int=986553823
    var dcf=DecimalFormat("#,###")
    var dcfs= DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator=','
    dcf.decimalFormatSymbols=dcfs
    println(x)
    println(dcf.format(x))
}