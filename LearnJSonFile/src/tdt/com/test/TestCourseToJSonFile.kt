package tdt.com.test

import com.google.gson.Gson
import tdt.com.model.Course
import java.io.FileWriter

fun main(args: Array<String>) {
    //Create a GSon object
    var gson = Gson()
    //create a course object
    var course = Course()
    course.Id="C12"
    course.Name="Kotlin Language"
    course.Credit=3
    //create a FileWriter object
    //this is location to save the data
    var file= FileWriter("D:\\course.json")
    //call toJson to convert course to json
    //and save this data to file
    gson.toJson(course, file)
    //We have to call close() method
    file.close()
}