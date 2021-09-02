package tdt.com.test

import tdt.com.io.JSonFileFactory
import tdt.com.model.Course

fun main(args: Array<String>) {
    var data:MutableList<Course> = mutableListOf()
    //create c1 course object
    var c1=Course()
    c1.Id="C12"
    c1.Name="Kotlin Language"
    c1.Credit=3
    //add c1 to list
    data.add(c1)
    //create c2 course object
    var c2=Course()
    c2.Id="C21"
    c2.Name="CSharp Language"
    c2.Credit=2
    //add c2 to list
    data.add(c2)
    //create c3 course object
    var c3=Course()
    c3.Id="C45"
    c3.Name="Edge Computing"
    c3.Credit=3
    //add c3 to list
    data.add(c3)
    //create JSonFileFactory object
    var jsff=JSonFileFactory()
    //call SaveFile
    var ret=jsff.SaveFile(data,"d:/courses.json")
    if(ret)
    {
        println("Save json file successfully")
    }
    else
    {
        println("Save json file failed")
    }
}
