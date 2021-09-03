import javax.swing.*;

public class HelloWorldUI {
    private JPanel panel1;
    //create frame object for window
    JFrame frame;
    public  HelloWorldUI(String title)
    {
        frame=new JFrame(title);
        //set the panel1 for frame
        //the UI from HellWorldUI.form
        frame.setContentPane(panel1);
    }
    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=500, height=300
        frame.setSize(500,300);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
