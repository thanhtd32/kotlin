import java.awt.event.ActionListener
import javax.swing.ButtonGroup
import javax.swing.ImageIcon
import javax.swing.JFrame

class ChangeImageUIKotlin :ChangeImageUI{
    var frame: JFrame
    constructor() {
        frame = JFrame("Change Image- JRadioButton")
        frame.contentPane = pnMain
        val bg = ButtonGroup()
        bg.add(radRose)
        bg.add(radOrchid)
        //set default image for
        icon = ImageIcon("images/rose.png")
        lblImage.setIcon(icon)
        //check if the Rose JRadioButton is checked
        radRose.addActionListener(
            ActionListener {
            if (radRose.isSelected()) {
                icon = ImageIcon("images/rose.png")
                lblImage.setIcon(icon)
            }
        })
        //check if the Orchid JRadioButton is checked
        radOrchid.addActionListener(
            ActionListener {
            if (radOrchid.isSelected()) {
                icon = ImageIcon("images/orchid.png")
                lblImage.setIcon(icon)
            }
        })
    }

    //this method uses to show the UI
    fun showUI() {
        //set 'X' corner button to close the window
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        //set size for window: width=500, height=300
        frame.setSize(500, 300)
        //set centering desktop for the window
        frame.setLocationRelativeTo(null)
        //show the window
        frame.isVisible = true
    }
}