package tdt.com.test

import com.google.gson.Gson
import tdt.com.model.Course

fun main(args: Array<String>) {
    //Create a GSon object
    var gson = Gson()
    //create a string json:
    var json = "{\"Id\":\"C12\",\"Name\":\"Kotlin Language\", \"Credit\":3}"
    //print the course information by json string
    println(json)
    //print the course information by object model
    var course = gson.fromJson(json, Course::class.java)
    println(course)
}