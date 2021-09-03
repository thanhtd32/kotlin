import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmFavoriteUI {
    private JPanel pnMain;
    private JCheckBox chkKotlin;
    private JCheckBox chkPython;
    private JCheckBox chkSharp;
    private JCheckBox chkJava;
    private JButton btnConfirm;
    JFrame frame;
    public ConfirmFavoriteUI()
    {
        frame=new JFrame("Learn Checkbox");
        frame.setContentPane(pnMain);
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processConfirmation();
            }
        });
    }
    private void processConfirmation() {
        StringBuilder builder=new StringBuilder();
        if(chkJava.isSelected())
        {
            builder.append(chkJava.getText());
            builder.append("\n");
        }
        if(chkKotlin.isSelected())
        {
            builder.append(chkKotlin.getText());
            builder.append("\n");
        }
        if(chkPython.isSelected())
        {
            builder.append(chkPython.getText());
            builder.append("\n");
        }
        if(chkSharp.isSelected())
        {
            builder.append(chkSharp.getText());
            builder.append("\n");
        }
        JOptionPane.showMessageDialog(null,builder);
    }

    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=300, height=150
        frame.setSize(300,150);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
