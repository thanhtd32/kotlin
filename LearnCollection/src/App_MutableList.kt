fun main(args: Array<String>) {
    var list:MutableList<Int> = mutableListOf()
    //add one element into the list
    list.add(10)
    list.add(4)
    list.add(5)
    list.add(8)
    //add multi elements into the list
    list.addAll(mutableListOf(9,0,7))
    println("Elements in MutableList - by value:")
    for(i in list)
        print("$i\t")
    println()
    println("Elements in MutableList - by index:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    //Change the second element values to 113
    list[2]=113
    println("Elements in MutableList after changing:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    //remove elements at index 3
    list.removeAt(3)
    println("Elements in MutableList after delete:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    //sort ascending the list
    list.sort()
    println("Elements in MutableList after sort ascending:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    //sort descending the list
    list.sortDescending()
    println("Elements in MutableList after sort descending:")
    for(i in list.indices)
        print("${list[i]}\t")
    println()
    println("SUM="+list.sum())
    println("MAX="+list.maxOrNull())
    println("MIN="+list.minOrNull())
    println("AVERAGE="+list.average())
    //filter  odd number
    var oddNumbers=list.filter { x->x%2==1 }
    println("Elements in MutableList are odd numbers:")
    for(i in oddNumbers.indices)
        print("${oddNumbers[i]}\t")
    println()
    //filter to get the prime list
    var primes=list.filter {
            x->
        var count=0
        for(i in 1..x)
        {
            if(x%i==0)
                count++
        }
        count==2
    }
    println("Elements in MutableList is prime:")
    for(i in primes.indices)
        print("${primes[i]}\t")
    println()
}
