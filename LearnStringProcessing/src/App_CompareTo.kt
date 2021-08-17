fun main(args: Array<String>) {
    var s1 = "KOTLIN"
    var s2 = "Kotlin"
    println("s1=$s1")
    println("s2=$s2")
    var x = s1.compareTo(s2, ignoreCase = true)
    println("compareTo return $x when ignoreCase true")
    var y = s1.compareTo(s2, ignoreCase = false)
    println("compareTo return $y when ignoreCase false")
}
