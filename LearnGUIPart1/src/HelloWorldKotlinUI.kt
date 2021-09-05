import javax.swing.JFrame

class HelloWorldKotlinUI : HelloWorldUI {
    //create frame object for window
    lateinit var frame: JFrame
    constructor()
    constructor(title:String)
    {
        frame = JFrame(title)
        //set the panel1 for frame
        //the UI from HellWorldUI.form
        //set the panel1 for frame
        //the UI from HellWorldUI.form
        frame.contentPane = panel1
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