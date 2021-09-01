import java.util.*

class Student {
    private var code:Int=0
    private var name:String?=null
    private var birthday: Date?=null
    public var Code:Int
        get() {return code}
        set(value) {code=value}
    public var Name:String?
        get()= name
        set(value) {name=value}
    public var Birthday:Date?
        get() = birthday
        set(value) {birthday=value}
    constructor(code: Int, name: String?, birthday: Date?) {
        this.code = code
        this.name = name
        this.birthday = birthday
    }
}
