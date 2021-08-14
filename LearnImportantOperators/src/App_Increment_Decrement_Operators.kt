fun main(args: Array<String>) {
    var a:Int=5
    var b:Int=8
    var c:Int=2
    a--
    b++
    var z=a++ + ++b - --c + 7
    println("a="+a)
    println("b="+b)
    println("c="+c)
    println("z="+z)
}