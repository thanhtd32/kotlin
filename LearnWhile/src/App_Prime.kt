fun main(args: Array<String>) {
    var n:Int=0
    println("Welcome to the Prime Program")
    while (true)
    {
        println("Enter an integer number:")
        n= readLine()!!.toInt()
        var count:Int=0
        for(i in 1..n)
        {
            if(n%i==0)
                count++
        }
        if(count==2)
            println("$n is prime number")
        else
            println("$n is not prime number")
        print("Continue?(y/n):")
        var s= readLine()
        if(s=="n")
            break
    }
    println("Goodbye!")
}