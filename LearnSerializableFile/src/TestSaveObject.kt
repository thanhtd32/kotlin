import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main(args: Array<String>) {
    var c=Contact()
    c.Id=100
    c.Name="Dr. John"
    c.Email="john@gmail.com"
    println(c)
    var path="d:/contact.data"
    try {
        var fos= FileOutputStream(path)
        var oos= ObjectOutputStream(fos)
        oos.writeObject(c)
        oos.close()
        fos.close()
        println("Save file successful!");
    }
    catch (ex:Exception)
    {
        ex.printStackTrace()
    }
}