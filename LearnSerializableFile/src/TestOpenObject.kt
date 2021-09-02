import java.io.FileInputStream
import java.io.ObjectInputStream

fun main(args: Array<String>) {
    var path="d:/contact.data"
    try
    {
        var fis= FileInputStream(path)
        var ois= ObjectInputStream(fis)
        var obj=ois.readObject()
        var data= obj as Contact
        ois.close()
        fis.close()
        println(data)
    }
    catch (ex:Exception)
    {
        ex.printStackTrace()
    }
}