package tdt.com.test

import tdt.com.io.JSonFileFactory
import tdt.com.model.Course
import tdt.com.model.Student

var path="D:/students.json"
var students:MutableList<Student> = mutableListOf()
fun main(args: Array<String>) {

    while(true)
    {
        println("1.Create Sample Data")
        println("2.Print Sample Data")
        println("3.Write Sample JsonData")
        println("4.Read Samle JsonData")
        println("5.Exit")
        print("Your choice:")
        var s:String?= readLine()
        if(s!=null)
        {
            if(s.equals("1"))
            {
               createSampledata()
            }
            else if(s.equals("2")) {
               printSampleData()
            }
            else if(s.equals("3"))
            {
                writeSampleJsonData()
            }
            else if(s.equals("4"))
            {
               readSampleJsonData()
            }
            else
                break
        }
    }
}
//create sample data list
fun createSampledata()
{
    students.clear()
    //create Student 1
    var st1=Student("ID1","John")
    students.add(st1)
    //create Student 2
    var st2=Student("ID2","Peter")
    students.add(st2)
    //create Student 3
    var st3=Student("ID3","Lucy")
    students.add(st3)

    //create c1 course object
    var c1= Course("C12","Kotlin Language",3)
    //create c2 course object
    var c2= Course("C21","CSharp Language",2)
    //create c3 course object
    var c3= Course("C45","Edge Computing",3)

    //add new courses for student
    st1.addCourse(c1)
    st1.addCourse(c3)
    st2.addCourse(c1)
    st2.addCourse(c2)
    st2.addCourse(c3)
    st3.addCourse(c2)
}
//print all sample data
fun printSampleData()
{
    for (student in students)
    {
        println(student)
        println("-----------------------------")
        for(course in student.Courses!!)
        {
            println("\t$course")
        }
        println("-----------------------------")
    }
}
//write sample data to json format
fun writeSampleJsonData()
{
    var jsff=JSonFileFactory()
    var ret= jsff.SaveFile(students, path)
    if(ret)
    {
        println("Save Json file successfully")
    }
    else
    {
        println("Save Json file failed")
    }
}
//read sample json data
fun readSampleJsonData()
{
    var jsff=JSonFileFactory()
    students=jsff.ReadFile(path)
    println("Open JSon File successfully")
}