import java.util.*

fun main(args: Array<String>) {
    //Declares array M with 10 elements of type Int
    var M:IntArray= IntArray(10)

    var rd=Random()
    for(i in M.indices)
        M[i]=rd.nextInt(100)
    println("List of elements in the array by value:")
    for (i in M)
        print("$i\t")
    println()
    println("List of elements in the array: by index:")
    for (i in M.indices)
        print("${M[i]}\t")
    println()
    //Largest number
    println("MAX=${M.maxOrNull()}")
    //smallest number
    println("MIN=${M.minOrNull()}")
    //Sum of array
    println("SUM=${M.sum()}")
    //average of array
    println("AVERAGE=${M.average()}")
    //count even number
    println("Even number=${M.count { x->x%2==0 }}")
    //count odd number
    println("Odd number=${M.count { x->x%2==1 }}")
    //Sort up ascending
    M.sort()
    println("List of array elements in ascending order:")
    for (i in M)
        print("$i\t")
    println()
    //sort up descending
    M.sortDescending()
    println("List of array elements in descending order:")
    for (i in M)
        print("$i\t")
    println()
    //filter  even number in array
    var evenNumbers= M.filter { x->x%2==0 }
    println("Even number:")
    for (i in evenNumbers)
        print("$i\t")
    println()
    //filter odd number in array
    var oddNumbers= M.filter { x->x%2==1 }
    println("Odd number:")
    for (i in oddNumbers)
        print("$i\t")
    println()
    var k=50
    //filter  number >50 in array
    var dsTim=M.filter { x->x>k }
    println("List of array elements > $k:")
    for (i in dsTim)
        print("$i\t")
    println()
}