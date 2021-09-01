package tdt.com.io
import tdt.com.model.Product
import java.io.*

class TextFileFactory {
    /**
     * @author TranDuy Thanh
     * @param data: Data is product list to be saved
     * @param path: Storage path
     * @return true if saved successfully, false if saved fails
     */
    fun SaveFile(data:MutableList<Product>,
                 path:String):Boolean
    {
        try {
            var fos = FileOutputStream(path)
            var osw = OutputStreamWriter(fos, "UTF-8")
            var bw = BufferedWriter(osw)
            //convert product to string format:
            //"$Code\t$Name\t$UnitPrice"
            //and save to file line by line
            for (product in data) {
                bw.write(product.toString());
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return false
    }

    /**
     * @author TranDuy Thanh
     * @param path:storage path to read data
     * @return Product list MutableList
     */
    fun ReadFile(path:String):MutableList<Product>
    {
        var data:MutableList<Product>
                = mutableListOf()
        try {
            var fis = FileInputStream(path)
            var isr = InputStreamReader(fis, "UTF-8")
            var br = BufferedReader(isr)

            var line = br.readLine()
            while (line != null) {
                //string format: "$Code\t$Name\t$UnitPrice"
                //we split this string format
                var arr = line.split("\t")
                if (arr.size == 3) {
                    //remodel the Product object
                    var product: Product = Product()
                    product.Code = arr[0].toInt()
                    product.Name = arr[1]
                    product.UnitPrice = arr[2].toDouble()
                    data.add(product)
                }
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
        return data
    }
}