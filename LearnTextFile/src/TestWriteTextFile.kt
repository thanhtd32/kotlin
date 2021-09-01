import java.io.BufferedWriter
import java.io.FileOutputStream
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    try {
        var path="d:/data.txt"
        var fos = FileOutputStream(path)
        var osw = OutputStreamWriter(fos, "UTF-8")
        var bw = BufferedWriter(osw)
        bw.write("Kotlin")
        bw.newLine()
        bw.write("Programming")
        bw.newLine()
        bw.write("Language")
        bw.close()
        osw.close()
        fos.close()
    }
    catch (ex:Exception)
    {
        ex.printStackTrace()
    }
}