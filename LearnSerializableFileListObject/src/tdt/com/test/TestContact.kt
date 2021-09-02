package tdt.com.test

import tdt.com.io.SerializableFileFactory
import tdt.com.model.Contact

/**
 * This function is used to add a new Contact
 * data entered by the user
 */
fun addNewContact():Contact
{
    print("Id:")
    var id= readLine()!!.toInt()
    print("Name:")
    var name= readLine()
    print("Email:")
    var email= readLine()
    var c=Contact(id,name,email)
    return c
}

/**
 * This function is used to export the list of contacts
 *to the screen
 */
fun printContacts(contacts:MutableList<Contact>)
{
    for (c in contacts)
    {
        println(c)
    }
}
fun main(args: Array<String>) {
    var contacts= mutableListOf<Contact>()
    while(true)
    {
        println("1.Add new Contact")
        println("2.Print Contacts")
        println("3.Serialize Contacts")
        println("4.Deserialize Contacts")
        println("5.Exit")
        print("Your choice:")
        var s:String?= readLine()
        if(s!=null)
        {
            if(s.equals("1"))
            {
                var c= addNewContact()
                contacts.add(c)
            }
            else if(s.equals("2")) {
                printContacts(contacts)
            }
            else if(s.equals("3"))
            {
                var sff=SerializableFileFactory()
                var ret=sff.saveFile(contacts,"d:/contacts.dat")
                if(ret==true)
                    println("Save file successful!")
                else
                    println("Save file Failed!")
            }
            else if(s.equals("4"))
            {
                var sff=SerializableFileFactory()
                var data=sff.openFile("d:/contacts.dat")
                if(data!=null)
                {
                    contacts= data as MutableList<Contact>
                    printContacts(contacts)
                }
            }
            else
                break
        }
    }
}