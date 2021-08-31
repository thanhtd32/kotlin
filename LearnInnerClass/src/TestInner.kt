fun main(args: Array<String>) {
    //cannot create an inner object:
    //Constructor of inner class Inner can be called only
    //with receiver of containing class
    //var in=Outer.Inner()//can not

    //create an outer object:
    var ot=Outer()
    //call method:
    ot.useInner()
}