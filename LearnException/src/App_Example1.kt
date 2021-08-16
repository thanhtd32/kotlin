fun main(args: Array<String>) {
    try {
        var a:Int=5
        var b:Int=0
        var c=a/b
        println("$a/$b=$c")
    }
    catch (e:Exception)
    {
        println(e.message)
    }
    finally {
        println("This is finally, 100% running, whether errors exist or not")
    }
}