fun optimize(s: String): String {
    var sToiTuu = s
    sToiTuu = sToiTuu.trim()
    val arrWord = sToiTuu.split(" ");
    sToiTuu = ""
    for (word in arrWord) {
        var newWord = word.lowercase()
        if (newWord.length > 0) {
            newWord = newWord.replaceFirst((newWord[0] + ""),
                (newWord[0] + "").uppercase())
            sToiTuu += newWord + " "
        }
    }
    return sToiTuu.trim()
}
fun main(args: Array<String>) {
    var s1 = "   TRAN        dUY     THanh   "
    println("The original string:")
    println(s1)
    //call optimize string method
    var s2 = optimize(s1)
    println("The optimization string:")
    println(s2)
    println("---------------------------")
    var s3 = "     I       am      kotlin       LANGUAGE   "
    println("The original string:")
    println(s3)
    //call optimize string method
    var s4 = optimize(s3)
    println("The optimization string:")
    println(s4)
}
