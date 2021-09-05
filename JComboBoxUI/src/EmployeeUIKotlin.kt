import java.awt.event.ActionListener
import javax.swing.JFrame
import javax.swing.JOptionPane

class EmployeeUIKotlin:EmployeeUI {
    var frame: JFrame
    constructor() {
        frame = JFrame("Learn JCombobox")
        frame.contentPane = pnMain
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman")
        cboEmployeeGender.addItem("Man")
        btnConfirm.addActionListener(
            ActionListener {
                processConfirmation()
            })
    }

    private fun processConfirmation() {
        //create Employee object(Kotlin class)
        var em = Employee()
        em.EmployeeID = txtEmployeeID.getText()
        em.EmployeeName = txtEmployeeName.getText()
        //check if user chooses the item in the JCombobox
        if (cboEmployeeGender.selectedIndex!= -1) {
            var gender =
                cboEmployeeGender.selectedItem as String
            em.EmployeeGender = gender
        }
        JOptionPane.showMessageDialog(null, em)
    }

    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=300, height=200
        frame.setSize(300, 200)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}