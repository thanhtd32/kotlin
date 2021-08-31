fun main(args: Array<String>) {
    //create a nested object:
    var nt=Outer.Nested()
    //call method:
    nt.doSomething()
    //create an outer object:
    var ot=Outer()
    //call method:
    ot.sayHelloOuter()
    ot.useNested()
}