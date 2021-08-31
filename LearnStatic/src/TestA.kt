fun main(args: Array<String>) {
    //call static printData() method
    A.printData()
    //call static data attribute
    println(A.data)

    var a1=A()
    a1.changeData(200)
    println("data be called by a1:"+a1.getData())

    var a2=A()
    println("data be called by a2:"+a2.getData())
    //a2 change data to 300
    a2.changeData(300)
    println("data be called by a1:"+a1.getData())
}