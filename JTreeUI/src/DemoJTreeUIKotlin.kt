import javax.swing.JFrame
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeModel

class DemoJTreeUIKotlin:DemoJTreeUI {
    var frame: JFrame
    constructor() {
        frame = JFrame("Learn JTree")
        frame.contentPane = pnMain

        //Remove all nodes in the tree
        var model = tvDemo.model as DefaultTreeModel
        var root = model.root as DefaultMutableTreeNode
        root.removeAllChildren()
        model.reload()
        model.setRoot(null)
        btnAddRoot.addActionListener {
            addRoot()
        }
        btnAddChild.addActionListener { addChild() }
        btnRemove.addActionListener { removeNode() }
        btnExpand.addActionListener { expandAll() }
        btnCollapse.addActionListener { collapseAll() }
    }

    //collapse all nodes
    private fun collapseAll() {
        var row = 0
        while (row < tvDemo.rowCount) {
            tvDemo.collapseRow(row)
            row++
        }
    }

    //expand all nodes
    fun expandAll() {
        var row = 0
        while (row < tvDemo.rowCount) {
            tvDemo.expandRow(row)
            row++
        }
    }

    //remove selected node
    private fun removeNode() {
        var obj = tvDemo.lastSelectedPathComponent
        if(obj == null)
            return
        var model = tvDemo.model as DefaultTreeModel
        var node = obj as DefaultMutableTreeNode
        if (node.parent != null) {
            model.removeNodeFromParent(node)
        } else {
            //remove the Root
            var root = model.root as DefaultMutableTreeNode
            root.removeAllChildren()
            model.reload()
            model.setRoot(null)
        }
    }

    //add a new node
    private fun addChild() {
        //get the selected node
        var obj = tvDemo.lastSelectedPathComponent
        if(obj == null)
            return
        var selectedNode = obj as DefaultMutableTreeNode
        //create a new Node:
        var value = txtValue.text
        var childNode = DefaultMutableTreeNode(value)
        selectedNode.add(childNode)
        //update the UI
        tvDemo.updateUI()
    }

    //add a root
    private fun addRoot() {
        var model = tvDemo.model as DefaultTreeModel
        var root: DefaultMutableTreeNode
        var value = txtValue.text
        root = DefaultMutableTreeNode(value)
        model.setRoot(root)
    }

    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=450, height=430
        frame.setSize(450, 430)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}