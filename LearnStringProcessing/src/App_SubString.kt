fun main(args: Array<String>) {
    val s = "Hello Kotlin Language"
    println("Original string:")
    println(s)
    //get all the right string from startIndex=6
    val s2 = s.substring(6)
    println("The string from startIndex=6:")
    //s2=Kotlin Language
    println(s2)

    //get child string from startIndex=6, endIndex=12(exclusive)
    val s3 = s.substring(6, 12)
    println("The string from startIndex=6, endIndex=12(exclusive):")
    //s3=Kotlin
    println(s3)
}
