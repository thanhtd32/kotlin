import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeUI {
    private JPanel pnMain;
    private JButton btnAdd;
    private JTextField txtEmployeeID;
    private JTextField txtEmployeeName;
    private JComboBox cboEmployeeGender;
    private JButton btnConfirm;
    JFrame frame;
    public EmployeeUI()
    {
        frame=new JFrame("Learn JCombobox");
        frame.setContentPane(pnMain);
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman");
        cboEmployeeGender.addItem("Man");
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processConfirmation();
            }
        });
    }
    private void processConfirmation() {
        //create Employee object(Kotlin class)
        Employee em=new Employee();
        em.setEmployeeID(txtEmployeeID.getText());
        em.setEmployeeName(txtEmployeeName.getText());
        //check if user chooses the item in the JCombobox
        if(cboEmployeeGender.getSelectedIndex()!=-1)
        {
            String gender= (String) cboEmployeeGender.getSelectedItem();
            em.setEmployeeGender(gender);
        }
        JOptionPane.showMessageDialog(null,em);
    }

    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=300, height=200
        frame.setSize(300,200);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
