import sun.applet.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    private JPanel pnMain;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JTextField txtResult;
    private JButton btnCalculate;
    private JButton btnClear;
    private JButton btnExit;
    JFrame frame;
    public MainUI()
    {
        frame=new JFrame("Quadratic Equation");
        frame.setContentPane(pnMain);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                txtResult.setText("");
                txtA.requestFocus();
            }
        });
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processQuaraticEquation();
            }
        });
    }
    private void processQuaraticEquation() {
        double a=Double.parseDouble(txtA.getText());
        double b=Double.parseDouble(txtB.getText());
        double c=Double.parseDouble(txtC.getText());
        if(a==0)
        {
            String msg="coefficient a must be different from 0";
            JOptionPane.showMessageDialog(null,msg);
        }
        if(a!=0)
        {
            double delta=Math.pow(b,2)-4*a*c;
            if (delta<0)
                txtResult.setText("No solution!");
            else if(delta==0)
            {
                txtResult.setText("x1=x2="+(-b/2*a));
            }
            else
            {
                double x1=(-b-Math.sqrt(delta))/(2*a);
                double x2=(-b+Math.sqrt(delta))/(2*a);
                txtResult.setText("x1="+x1+";x2="+x2);
            }
        }
    }

    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=300, height=260
        frame.setSize(300,260);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
