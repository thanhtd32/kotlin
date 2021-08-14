fun main(args: Array<String>) {
    var a:Int=8
    var b:Int=5

    println("Plus method 1:"+a+"+"+b+"="+(a+b))
    println("Plus method 2:"+a+"+"+b+"="+(a.plus(b)))
    println("Minus method 1:"+a+"-"+b+"="+(a-b))
    println("Minus method 2:"+a+"-"+b+"="+(a.minus(b)))
    println("Multiply method 1:"+a+"*"+b+"="+(a*b))
    println("Multiply method 2:"+a+"*"+b+"="+(a.times(b)))
    println("Divide method 1:"+a+"/"+b+"="+(a/b))
    println("Divide method 2:"+a+"/"+b+"="+(a.div(b)))
    println("Find remainders method 1:"+a+"%"+b+"="+(a%b))
    println("Find remainders method 2:"+a+"/"+b+"="+(a.rem(b)))
    println(8.plus(9))
}