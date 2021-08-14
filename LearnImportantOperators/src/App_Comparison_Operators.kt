fun main(args: Array<String>) {
    var a:Int=8
    var b:Int=5
    println(a==b)//false
    println(a.equals(b))//false
    println(!a.equals(b))//true
    println(a.compareTo(b))//1
    println(3.compareTo(3))//0
    println(3.compareTo(5))//-1
    println(5.compareTo(3))//1
}