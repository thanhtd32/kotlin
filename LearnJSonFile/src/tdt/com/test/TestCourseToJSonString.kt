package tdt.com.test

import com.google.gson.Gson
import tdt.com.model.Course

fun main(args: Array<String>) {
    //Create a GSon object
    var gson = Gson()
    //create a course object
    var course = Course()
    course.Id="C12"
    course.Name="Kotlin Language"
    course.Credit=3
    //convert course object to json string
    var jsonInString = gson.toJson(course)
    //print the course information by json string
    println(jsonInString)
    //print the course information by object model
    println(course)
}