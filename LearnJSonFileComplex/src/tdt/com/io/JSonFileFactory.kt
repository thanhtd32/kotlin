package tdt.com.io

import com.google.gson.Gson
import java.io.FileWriter
import java.io.FileReader
import com.google.gson.reflect.TypeToken
import tdt.com.model.Course
import tdt.com.model.Student

class JSonFileFactory {
    /**
     * @author Tran Duy Thanh
     * @param data: Data is Student list to be saved
     * @param path: Storage path
     * @return true if saved successfully,
     * false if save fails
     */
    fun SaveFile(data:MutableList<Student>,
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
     * @author Tran Duy Thanh
     * @param path:storage path to read data
     * @return Any list MutableList
     */
    fun ReadFile(path:String):MutableList<Student>
    {
        var data:MutableList<Student>
        data= mutableListOf()
        try
        {
            val gson = Gson()
            var file=FileReader(path)
            data = gson.fromJson(file,
                object :
                    TypeToken<MutableList<Student>>()
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
