fun main(args: Array<String>) {
    //Declare tom Student object
    var tom=Student()
    //call Code Property (set)
    tom.Code=100
    //call Name Property (get)
    tom.Name="Tom Hoping"
    println("The Information:")
    //call Code Property(get)
    println("Code = ${tom.Code}")
    //call Name Property(get)
    println("Name = ${tom.Name}")

    println("-----------------")
    //We can use the constructor
    var jerry=Student(200,"Jerry Cherry")
    //call Code Property(get)
    println("Code = ${jerry.Code}")
    //call Name Property(get)
    println("Name = ${jerry.Name}")
}
