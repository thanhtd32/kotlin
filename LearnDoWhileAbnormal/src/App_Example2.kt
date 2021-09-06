fun main(args: Array<String>) {
    var year:Int=0
    var s:String?
    println("Welcome to the leap year program!")
    do
    {
        while (true)
        {
            println("Enter 1 year (>0):")
            s= readLine()
            if(s.isNullOrBlank())
                continue
            year=s.toInt()
            if(year>0)
                break
        }
        if(year%4==0&&year%100!=0 || year%400==0)
        {
            println("Year $year is a leap year ")
        }
        else
        {
            println("Year $year is not a leap year")
        }
        print("Continue?(y/n):")
        s= readLine()
        if(s=="n")
            break;
    }while (true)
    println("Good bye!")
}