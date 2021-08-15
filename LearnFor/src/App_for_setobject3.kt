fun main(args: Array<String>) {
    var books= arrayOf("Kotlin","Java","C#","Python","R")
    for ((index,value) in books.withIndex())
    {
        println("The value at index $index is [$value]")
    }
}