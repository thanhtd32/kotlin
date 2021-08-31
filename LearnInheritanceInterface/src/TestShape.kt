fun main(args: Array<String>) {
    var c = Circle(5.0)
    System.out.println("Perimeter of the circle= ")
    System.out.println(c.perimeter())
    System.out.println("Area of the circle= ")
    System.out.println(c.area())

    var s = Square(5.0)
    System.out.println("Perimeter of the square = ")
    System.out.println(s.perimeter())
    System.out.println("Area of the square=")
    System.out.println(s.area())
}