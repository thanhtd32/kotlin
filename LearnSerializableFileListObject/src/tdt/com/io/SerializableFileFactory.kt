package tdt.com.io
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class SerializableFileFactory {
    /**
     * this function uses to save the object data
     * into the file on the disk
     * @param data the object to save
     * @param path the path to save the data
     * @return true/false
     */
    public fun saveFile(data:Any,path:String):Boolean
    {
        try {
            var fos= FileOutputStream(path)
            var oos= ObjectOutputStream(fos)
            oos.writeObject(data)
            oos.close()
            fos.close()
            return true
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return false
    }

    /**
     * this function use to deserialize the Object
     * @param path the path of the file
     * @return object or null
     */
    public fun openFile(path:String): Any?
    {
        try
        {
            var fis= FileInputStream(path)
            var ois= ObjectInputStream(fis)
            var data=ois.readObject()
            ois.close()
            fis.close()
            return data
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return null
    }
}