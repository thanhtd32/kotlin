class Employee {
    public var EmployeeID:String=""
        get() {return field}
        set(value) {field=value}
    public var EmployeeName:String=""
        get() {return field}
        set(value) {field=value}
    public var EmployeeGender=""
        get() {return field}
        set(value) {field=value}
    constructor()
    constructor(EmployeeID: String,
                EmployeeName: String,
                EmployeeGender: String) {
        this.EmployeeID = EmployeeID
        this.EmployeeName = EmployeeName
        this.EmployeeGender = EmployeeGender
    }

    override fun toString(): String {
        return  "Employee ID:$EmployeeID\n" +
                "Employee Name:$EmployeeName\n" +
                "Employee Gender:$EmployeeGender"
    }
}