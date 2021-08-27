fun main(args: Array<String>) {
    var t1=Triangle(4.0,5.0,6.0)
    println("Information about triangle 1:")
    println("Perimeter="+t1.perimeter())
    println("Area="+t1.area())

    var t2=Triangle()
    t2.slide1=7.5
    t2.slide2=10.3
    t2.slide3=15.5
    println("Information about triangle 2:")
    println("Perimeter="+t2.perimeter())
    println("Area="+t2.area())
}