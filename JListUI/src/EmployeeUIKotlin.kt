import javax.swing.DefaultListModel
import javax.swing.JFrame

class EmployeeUIKotlin:EmployeeUI {
    var frame: JFrame
    var model: DefaultListModel<Employee>
    constructor() {
        frame = JFrame("Learn JList")
        frame.contentPane = pnMain
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman")
        cboEmployeeGender.addItem("Man")
        //assign model for JList
        model = DefaultListModel()
        lstEmployee.setModel(model)
        btnAdd.addActionListener {
            addEmployeeToList()
        }
        btnRemove.addActionListener {
            removeEmployee()
        }
        lstEmployee.addListSelectionListener {
            showDetailEmployee()
        }
    }
    //show detail employee when user click on JList
    private fun showDetailEmployee() {
        var obj = lstEmployee.selectedValue
        if (obj != null) {
            var em = obj as Employee
            txtEmployeeID.text = em.EmployeeID
            txtEmployeeName.text = em.EmployeeName
            var gender = em.EmployeeGender
            cboEmployeeGender.selectedItem = gender
        }
    }
    //remove the selected employee
    private fun removeEmployee() {
        var obj = lstEmployee.selectedValue
        if (obj != null) {
            model.removeElement(obj)
        }
    }
    //add a new employee into the JList
    private fun addEmployeeToList() {
        var em = Employee()
        em.EmployeeID = txtEmployeeID.text
        em.EmployeeName = txtEmployeeName.text
        if (cboEmployeeGender.selectedIndex != -1) {
            var gender=cboEmployeeGender.selectedItem
            em.EmployeeGender = gender.toString()
        }
        model.addElement(em)
    }
    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=300, height=200
        frame.setSize(300, 380)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}
