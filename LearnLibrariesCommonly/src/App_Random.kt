import java.util.Random

fun main(args: Array<String>) {
    while (true) {
        play()
        println("Do you want to play again?(y/n):")
        val tl = readLine()
        if (tl.equals("n", ignoreCase = true))
            break
    }
    println("Good bye!")
}
fun play()
{
    var rd = Random()
    var numberofProgram = rd.nextInt(101)
    println("Program picked a value in [0...100] Please guess!")
    var numberofPeople: Int=0
    var numberofGuesses = 0
    do {
        println("What number do you guess?:")
        var s=readLine()
        if(s!=null)
            numberofPeople = s.toInt()
        numberofGuesses++
        println("You guess the $numberofGuesses times")
        if (numberofPeople == numberofProgram) {
            println("Congratulations!!!")
            println("You are right!!")
            println("Number of program is $numberofProgram")
            break
        }
        if (numberofPeople < numberofProgram) {
            println("You are wrong!!!")
            println("Number of program> your number")
        } else {
            println("You are wrong!!!")
            println("Number of program<your number")
        }
        if (numberofGuesses == 7) {
            println("You are Game Over!!!")
            println("Because you are wrong 7 times!")
            break
        }
    } while (numberofGuesses <= 7)
}