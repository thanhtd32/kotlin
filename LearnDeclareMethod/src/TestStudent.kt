fun main(args: Array<String>) {
    var st=Student()
    st.Code=300
    st.Name="Jonh Weird"
    println("Information by Property:")
    println("Code:"+st.Code)
    println("Name:"+st.Name)

    println("--------Call the method printInfor()---------")
    st.printInfor()
    println("--------Call the method detail()---------")
    var detail=st.details()
    println(detail)

    println("-----------Call toString()--------------")
    println(st)
}