import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JFrame
import javax.swing.table.DefaultTableModel

class EmployeeUIKotlin : EmployeeUI {
    var tableModel: DefaultTableModel
    var frame: JFrame
    constructor() {
        frame = JFrame("Learn JTable")
        frame.contentPane = pnMain
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman")
        cboEmployeeGender.addItem("Man")
        //Create the DefaultTableModel object
        tableModel = DefaultTableModel()
        //add 3 columns for DefaultTableModel
        tableModel.addColumn("Employee ID")
        tableModel.addColumn("Employee Name")
        tableModel.addColumn("Employee Gender")
        //setmodel for JTable
        tblEmployee.setModel(tableModel)
        btnAdd.addActionListener{
            processAddNewEmployee()
        }
        tblEmployee.addMouseListener(
            object : MouseAdapter() {
            override fun mousePressed(e: MouseEvent) {
                super.mousePressed(e)
                showDetailEmployee()
            }
        })
        btnRemove.addActionListener{
            processRemoveEmployee()
        }
    }
    //remove employee from the JTable
    private fun processRemoveEmployee() {
        if (tblEmployee.selectedRow == -1)
            return
        var row: Int = tblEmployee.selectedRow
        tableModel.removeRow(row)
    }
    //Show detail employee information
    private fun showDetailEmployee() {
        if (tblEmployee.selectedRow == -1)
            return
        var row: Int = tblEmployee.selectedRow
        var id = tblEmployee.getValueAt(row, 0)
        var name = tblEmployee.getValueAt(row, 1)
        var gender = tblEmployee.getValueAt(row, 2)
        txtEmployeeID.setText(id.toString())
        txtEmployeeName.setText(name.toString())
        cboEmployeeGender.
                setSelectedItem(gender.toString())
    }
    //add new employee
    private fun processAddNewEmployee() {
        var id: String = txtEmployeeID.getText()
        var name: String = txtEmployeeName.getText()
        var gender = ""
        if (cboEmployeeGender.selectedIndex == 0)
            gender = "Woman"
        else
            gender ="Man"
        var row = arrayOf(id, name, gender)
        //insert new row
        tableModel.addRow(row)
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