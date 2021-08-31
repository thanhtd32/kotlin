class Outer {
    var name: String = "Outer"
    fun sayHelloOuter()
    {
        println("Hello Outer")
    }
    fun useInner()
    {
        var inn=Inner()
        inn.doSomething()
    }
    inner class Inner {
        //inner class can access attribute or
        // function in the outer class, such as:
        // -name attribute,
        // -sayHelloOuter() function
        fun doSomething()
        {
            println("The function in the Inner class")
            println("The name from outer=$name")
            sayHelloOuter()
        }
    }
}
