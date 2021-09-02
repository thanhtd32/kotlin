import java.io.Serializable

class Contact :Serializable {
    public var Id:Int = 0
        get() {return field}
        set(value) {field=value}
    public var Name:String=""
        get() {return field}
        set(value) {field=value}
    public var Email:String=""
        get() {return field}
        set(value) {field=value}
    constructor()
    constructor(Id: Int,
                Name: String,
                Email: String) {
        this.Id = Id
        this.Name = Name
        this.Email = Email
    }
    override fun toString(): String {
        return "$Id\t$Name\t$Email"
    }
}