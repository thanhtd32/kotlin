fun main(args: Array<String>) {
    var a:Double=0.0;
    var b:Double=0.0;
    var op:String?
    println("Input a:")
    a= readLine()!!.toDouble()
    println("Input b:")
    b= readLine()!!.toDouble()
    println("Enter operator(+,-,*,/):")
    op= readLine()
    when(op)
    {
        "+"-> println("$a + $b = "+(a+b))
        "-"-> println("$a - $b = "+(a-b))
        "*"-> println("$a * $b = "+(a*b))
        "/"->
            if(b==0.0)
                println("Denominator must be different from 0")
            else
                println("$a / $b = "+(a/b))
        else-> println("Invalid operator")
    }
}