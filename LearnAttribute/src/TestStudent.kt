fun main(args: Array<String>) {
    //create lucy object with default constructor
    var lucy=Student()
    //access attributes and assign the value
    lucy.code=500
    lucy.name="Lucy Brian"
    println("Information of Lucy:")
    println("Code =${lucy.code}")
    println("Name=${lucy.name}")

    println("--------------------")
    //create crystal object with secondary constructor
    var crystal=Student(600,"Crystal Brian")
    println("Information of Crystal:")
    println("Code =${crystal.code}")
    println("Name=${crystal.name}")
}