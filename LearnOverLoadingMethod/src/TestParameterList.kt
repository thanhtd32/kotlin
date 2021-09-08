fun countOfEvenNumber(vararg numbers: Int):Int {
    var n=numbers.count { x->x%2==0 }
    return n
}

fun main(args: Array<String>) {
    var n1=countOfEvenNumber(1,2,3,4)
    println("Even numbers=$n1")
    var n2=countOfEvenNumber(2,4,3,8,6)
    println("Even numbers=$n2")
    var n3=countOfEvenNumber()
    println("Even numbers=$n3")
    var n4=countOfEvenNumber(1,2,3,4,5,6,7,8,9,20,18)
    println("Even numbers=$n4")
}
