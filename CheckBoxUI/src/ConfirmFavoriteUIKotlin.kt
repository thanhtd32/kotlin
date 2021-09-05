import java.awt.event.ActionListener
import javax.swing.JFrame
import javax.swing.JOptionPane

class ConfirmFavoriteUIKotlin:ConfirmFavoriteUI {
    var frame: JFrame
    constructor() {
        frame = JFrame("Learn Checkbox")
        frame.contentPane = pnMain
        btnConfirm.addActionListener(
            ActionListener {
                processConfirmation()
            })
    }
    private fun processConfirmation() {
        val builder = StringBuilder()
        if (chkJava.isSelected) {
            builder.append(chkJava.text)
            builder.append("\n")
        }
        if (chkKotlin.isSelected) {
            builder.append(chkKotlin.text)
            builder.append("\n")
        }
        if (chkPython.isSelected) {
            builder.append(chkPython.text)
            builder.append("\n")
        }
        if (chkSharp.isSelected) {
            builder.append(chkSharp.text)
            builder.append("\n")
        }
        JOptionPane.showMessageDialog(null, builder)
    }

    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=300, height=150
        frame.setSize(300, 150)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}