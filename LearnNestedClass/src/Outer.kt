class Outer {
    var name: String = "Outer"
    fun sayHelloOuter()
    {
        println("Hello Outer")
    }
    fun useNested()
    {
        var nt=Nested()
        nt.doSomething()
    }
    class Nested {
        //nested class can not access attribute or
        // function in the outer class, such as:
        // -name attribute,
        // -sayHelloOuter() function
        fun doSomething()
        {
            println("The Nested class")
        }
    }
}