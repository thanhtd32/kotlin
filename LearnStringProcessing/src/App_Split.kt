fun main(args: Array<String>) {
    //the string with format: ID;FullName;Email
    var s:String="123;Tran Duy Thanh;thanhtd@uel.edu.vn"
    //split by ; character
    //The elements are stored in the List
    var arr:List<String> = s.split(";")
    println("Number of elements="+arr.size)
    //Get ID
    var id=arr[0]
    //Get Name
    var fullName=arr[1]
    //Get Email
    var email=arr[2]
    //print the informations:
    println("ID=$id")
    println("Full Name=$fullName")
    println("Email=$email")
}
