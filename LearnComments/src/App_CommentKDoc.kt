/**
 * @author Tran Duy Thanh
 * @param x parameter x
 * @param y parameter y
 * @return sum of x and y
 * @sample x=5, y=6 => 11
 * This is docs comment
 */
fun Plus(x:Int,y:Int):Int
{
    return x+y
}
/*
This is the main function
used to run the program
 */
fun main(args: Array<String>) {
    //call plus 2 numbers function
    val t:Int=Plus(7,8)
    println(t)
}
