fun main(args: Array<String>) {
    var s = "Hello Kotlin Language, and Hello Python Language"
    println("The original string:")
    println(s)
    //oldValue: "Hello"
    //newVale: "Hi"
    //true is ignorecase
    s = s.replaceFirst("Hello", "Hi",true)
    println("The string after replacing first:")
    println(s)
}