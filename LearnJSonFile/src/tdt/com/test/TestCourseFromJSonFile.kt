package tdt.com.test

import com.google.gson.Gson
import tdt.com.model.Course
import java.io.FileReader

fun main(args: Array<String>) {
    //Create a GSon object
    var gson = Gson()
    //create a FileReader object
    //this is location to read the data
    var fr=FileReader("D:\\course.json")
    //call fromJson method
    //Course::class.java is syntax to convert
    var course = gson.fromJson(fr, Course::class.java)
    println(course)
}