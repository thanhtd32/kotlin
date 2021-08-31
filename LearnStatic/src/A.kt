class A {
    companion object
    {
        fun printData()
        {
            println("The Print Data method")
        }
        var data:Int=100
    }
    fun changeData(x:Int)
    {
        data=x
    }
    fun getData():Int
    {
        return data
    }
}