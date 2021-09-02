package tdt.com.model

import java.io.Serializable

class Course : Serializable{
    public var Id:String?=null
        get() {return field}
        set(value) {field=value}
    public var Name:String?=null
        get() {return field}
        set(value) {field=value}
    public var Credit:Int=0
        get() {return field}
        set(value) {field=value}
    constructor()
    constructor(Id: String?,
                Name: String?,
                Credit: Int) {
        this.Id = Id
        this.Name = Name
        this.Credit = Credit
    }
    override fun toString(): String {
        return "$Id\t$Name\t$Credit"
    }
}