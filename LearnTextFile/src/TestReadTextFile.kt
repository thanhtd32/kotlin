import java.io.FileInputStream
import java.io.InputStreamReader
import java.io.BufferedReader
fun main(args: Array<String>) {
    try {
        var path="d:/data.txt"
        var fis = FileInputStream(path)
        var isr = InputStreamReader(fis, "UTF-8")
        var br = BufferedReader(isr)

        var line = br.readLine()
        while (line != null) {
            println(line)
            line = br.readLine()
        }
        br.close()
        isr.close()
        fis.close()
    }
    catch (ex:Exception)
    {
        ex.printStackTrace()
    }
}