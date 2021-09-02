package tdt.com.io

import com.google.gson.Gson
import java.io.FileWriter
import java.io.FileReader
import com.google.gson.reflect.TypeToken
import tdt.com.model.Course

class JSonFileFactory {
    /**
     * @author TranDuy Thanh
     * @param data: Data is Course list to be saved
     * @param path: Storage path
     * @return true if saved successfully,
     * false if save fails
     */
    fun SaveFile(data:MutableList<Course>,
                 path:String):Boolean
    {
        try {
            val gs= Gson()
            val file=FileWriter(path)
            gs.toJson(data,file)
            file.close()
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
    fun ReadFile(path:String):MutableList<Course>
    {
        var data:MutableList<Course> = mutableListOf()
        try
        {
            val gson = Gson()
            var file=FileReader(path)
            data = gson.fromJson(file,
                object :
                    TypeToken<MutableList<Course>>()
                {
                }.type
            )
            file.close()
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return data
    }
}
