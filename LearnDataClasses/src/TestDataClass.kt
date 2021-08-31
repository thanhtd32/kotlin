fun main(args: Array<String>) {
    //Create a data class with name User
    data class User(
        var UserName:String,
        var Password:String)
    //create an User object
    var user1=User(
        UserName = "john",
        Password = "113@114Xa")
    println("User information of user 1:")
    println(user1.toString())
    println("User Name =${user1.UserName}")
    println("Password=${user1.Password}")

    //copy data:
    var user2=user1.copy()
    println("User information of user 2:")
    println(user2.toString())
    //copy data and change value for Property
    var user3=user1.copy(Password ="12345678" )
    println("User information of user 3:")
    println(user3.toString())
}
