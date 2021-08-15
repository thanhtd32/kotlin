fun main(args: Array<String>) {
    var a:Int
    var b:Int
    println("Input a:")
    a= readLine()!!.toInt()
    println("Input b:")
    b= readLine()!!.toInt()
    var gcd=1
    var min=if (a>b) b else a
    for (i in min downTo 1)
    {
        if(a%i==0 && b%i==0)
        {
            gcd=i
            break
        }
    }
    println("GCD of $a and $b is $gcd")
}