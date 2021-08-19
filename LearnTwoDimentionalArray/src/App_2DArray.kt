import java.util.*

fun main(args: Array<String>) {
    var M:Array<IntArray> = Array(6,{IntArray(5)})
    var rd:Random = Random()
    for(i in M.indices)
    {
        for(j in M[i].indices)
        {
            M[i][j]=rd.nextInt(100)
        }
    }
    println("Two-dimentional Array after input data:")
    for(i in M.indices)
    {
        for(j in M[i].indices)
        {
            print("${M[i][j]}\t")
        }
        println()
    }
    println("Two-dimentional Array after input data - way 2:")

    for(row in M)
    {
        for(item in row)
        {
            print("$item \t")
        }
        println()
    }
    println("Array at row 1:")
    var M1=M[1]
    for (i in M1.indices)
        print("${M1[i]}\t")
    println()
}
