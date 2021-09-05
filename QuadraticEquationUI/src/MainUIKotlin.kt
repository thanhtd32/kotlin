import javax.swing.JFrame
import javax.swing.JOptionPane

class MainUIKotlin : MainUI{
    var frame: JFrame
    constructor() {
        frame = JFrame("Quadratic Equation")
        frame.contentPane = pnMain
        btnExit.addActionListener { System.exit(0) }
        btnClear.addActionListener {
            txtA.text = ""
            txtB.text = ""
            txtC.text = ""
            txtResult.text = ""
            txtA.requestFocus()
        }
        btnCalculate.addActionListener{
            processQuaraticEquation()
        }
    }
    private fun processQuaraticEquation() {
        var a = txtA.text.toDouble()
        var b = txtB.text.toDouble()
        var c = txtC.text.toDouble()
        if (a == 0.0) {
            var msg = "a must be different from 0"
            JOptionPane.showMessageDialog(null, msg)
        }
        if (a != 0.0) {
            var delta = Math.pow(b, 2.0) - 4 * a * c
            if (delta < 0)
                txtResult.text = "No solution!"
            else if (delta == 0.0)
            {
                var result= "x1=x2=" + -b / 2 * a
                txtResult.text =result
            }
            else {
                var x1 = (-b - Math.sqrt(delta)) / (2 * a)
                var x2 = (-b + Math.sqrt(delta)) / (2 * a)
                txtResult.text = "x1=$x1;x2=$x2"
            }
        }
    }
    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=300, height=260
        frame.setSize(300, 260)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}