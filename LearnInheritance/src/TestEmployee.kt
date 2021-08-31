fun main(args: Array<String>) {
    //create an Official Employee
    var emp1=OfficialEmployee(100,"Mr John")
    //call the calculateSalary method
    var salaryEmp1=emp1.calculateSalary(22)
    println("Information of emp1:")
    //call the toString() method
    println(emp1)
    println("Salary of emp1=$salaryEmp1")
    println("------------------------")
    //create a Temporary Employee
    var emp2=TemporaryEmployee(200,"Mr Peter")
    //call the calculateSalary method
    var salaryEmp2=emp2.calculateSalary(3)
    println("Information of emp2:")
    //call the toString() method
    println(emp2)
    println("Salary of emp2=$salaryEmp2")
}