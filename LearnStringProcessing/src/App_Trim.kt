fun main(args: Array<String>) {
    var s:String= "    Tran Duy Thanh      "
    println("The Original string:")
    println("[$s]")
    println("->The length of the string:${s.length}")
    println("---------------------------------")
    //remove the whitespace string from start
    var s2=s.trimStart()
    println("The string after calls the trimStart:")
    println("[$s2]")
    println("->The length of the string:${s2.length}")
    println("---------------------------------")
    //remove the whitespace string from end
    var s3=s.trimEnd()
    println("The string after calls the trimEnd:")
    println("[$s3]")
    println("->The length of the string:${s3.length}")
    println("---------------------------------")
    //remove the whitespace string start and end
    var s4=s.trim()
    println("The string after calls the trim:")
    println("[$s4]")
    println("->The length of the string:${s4.length}")
}
