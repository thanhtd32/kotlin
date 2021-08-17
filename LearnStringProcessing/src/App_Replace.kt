fun main(args: Array<String>) {
    var s = "Hello Kotlin Language"
    println("The original string:")
    println(s)
    //change kotlin to Python (ignorecase)
    s = s.replace("KOTLIN", "Python",true)
    println("The replacing string:")
    println(s)
}
