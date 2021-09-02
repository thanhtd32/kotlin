package tdt.com.test

import tdt.com.io.JSonFileFactory
import tdt.com.model.Course

fun main(args: Array<String>) {
    //create courses list object
    var courses:MutableList<Course>
    //create JSonFileFactory object
    var jsff= JSonFileFactory()
    //call ReadFile method
    courses=jsff.ReadFile("d:/courses.json")
    //print all
    for (course in courses)
        println(course)
}