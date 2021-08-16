fun main(args: Array<String>) {
    //Create StringBuilder object
    var sb= StringBuilder("Hello Kotlin")
    //Hello Kotlin
    println(sb.toString())
    //append a string to last original string
    sb.append(" Language")
    //Hello Kotlin Language
    println(sb.toString())
    //insert say at the first string
    sb.insert(0,"Say ")
    //Say Hello Kotlin Language
    println(sb.toString())
    //delete a string from index 3 to 9
    sb.delete(3,9)
    //Say Kotlin Language
    println(sb.toString())
    //reverse the original string
    sb.reverse()
    //egaugnaL niltoK yaS
    println(sb.toString())
}