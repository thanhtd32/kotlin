package tdt.com.io

import tdt.com.model.Product
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.w3c.dom.Element

class XMLFileFactory {
    /**
     * @author Tran Duy Thanh
     * @param data: Data is Product list to be saved
     * @param path: Storage path
     * @return true if saved successfully, false if save fails
     */
    fun SaveFile(data:MutableList<Product>, path:String):Boolean
    {
        try
        {
            var docFactory = DocumentBuilderFactory.newInstance()
            var docBuilder = docFactory.newDocumentBuilder()
            // create document object
            var doc = docBuilder.newDocument()
            //create root element <Products>
            var rootElement = doc.createElement("Products")
            //add rootElement to document
            doc.appendChild(rootElement)
            for(product in data)
            {
                //create Product element <Product>
                var productElement = doc.createElement("Product")
                //create Code element <Code>
                var codeElement=doc.createElement("Code")
                codeElement.textContent=product.Code.toString()
                //add <Code> tag into <Product> tag
                productElement.appendChild(codeElement)
                //create Name element <Name>
                var nameElement=doc.createElement("Name")
                nameElement.textContent=product.Name
                //add <Name> tag into <Product> tag
                productElement.appendChild(nameElement)
                //create Price element <Price>
                var priceElement=doc.createElement("Price")
                priceElement.textContent=product.UnitPrice.toString()
                //add <Price> tag into <Product> tag
                productElement.appendChild(priceElement)
                ////add <Product> tag into <Products> tag
                rootElement.appendChild(productElement)
            }
            // write the content into xml file
            var transformerFactory = TransformerFactory.newInstance()
            var transformer = transformerFactory.newTransformer()
            var source = DOMSource(doc)
            var result = StreamResult(File(path).absolutePath)

            // Output to console for testing
            transformer.transform(source, result)
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
        var data:MutableList<Product> = mutableListOf()
        try {
            //Get the DOM Builder Factory
            var factory = DocumentBuilderFactory.newInstance()
            //Get the DOM Builder
            var builder = factory.newDocumentBuilder()
            //Load and Parse the XML document
            //document contains the complete XML as a Tree.
            var xmlfile = File(path)
            var document = builder.parse(xmlfile)
            //Iterating through the nodes and extracting the data.
            var nodeList = document.documentElement.childNodes

            for (i in 0..nodeList.length - 1) {
                //We have encountered an <Product> tag.
                var node = nodeList.item(i)
                if (node is Element) {
                    var product = Product()
                    var childNodes = node.getChildNodes()
                    for (j in 0..childNodes.getLength() - 1) {
                        var cNode = childNodes.item(j)

                        //Identifying the child tag of Product encountered.
                        if (cNode is Element) {
                            var content = cNode.getLastChild()
                                        .getTextContent().trim()
                            when (cNode.getNodeName()) {
                                "Code" ->
                                    product.Code= content.toInt()
                                "Name" ->
                                    product.Name= content
                                "Price" ->
                                    product.UnitPrice=
                                        content.toDouble()
                            }
                        }
                    }
                    data.add(product)
                }
            }
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return data
    }
}