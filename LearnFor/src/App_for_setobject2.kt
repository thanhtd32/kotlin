fun main(args: Array<String>) {
    var books= arrayOf("Kotlin","Java","C#","Python","R")
    for (i in books.indices)
        println("The value at index $i is [${books[i]}]")
}