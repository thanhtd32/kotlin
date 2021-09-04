import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeUI {
    private JTextField txtEmployeeID;
    private JTextField txtEmployeeName;
    private JComboBox cboEmployeeGender;
    private JButton btnAdd;
    private JButton btnRemove;
    private JList lstEmployee;
    private JPanel pnMain;
    private JPanel pnSouth;
    private JPanel pnEmployee;
    private JPanel pnButton;
    private JPanel pnListEmployee;
    private JPanel pnTitle;
    JFrame frame;
    DefaultListModel<Employee>model;
    public EmployeeUI()
    {
        frame=new JFrame("Learn JCombobox");
        frame.setContentPane(pnMain);
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman");
        cboEmployeeGender.addItem("Man");
        //assign model for JList
        model=new DefaultListModel<>();
        lstEmployee.setModel(model);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployeeToList();
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeEmployee();
            }
        });
        lstEmployee.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                showDetailEmployee();
            }
        });
    }
    //show detail employee when user click on JList
    private void showDetailEmployee() {
        Object obj=lstEmployee.getSelectedValue();
        if(obj!=null)
        {
            Employee em= (Employee) obj;
            txtEmployeeID.setText(em.getEmployeeID());
            txtEmployeeName.setText(em.getEmployeeName());
            String gender=em.getEmployeeGender();
            cboEmployeeGender.setSelectedItem(gender);
        }
    }
    //remove the selected employee
    private void removeEmployee() {
        Object obj=lstEmployee.getSelectedValue();
        if(obj!=null)
        {
            model.removeElement(obj);
        }
    }
    //add a new employee into the JList
    private void addEmployeeToList() {
        Employee em=new Employee();
        em.setEmployeeID(txtEmployeeID.getText());
        em.setEmployeeName(txtEmployeeName.getText());
        if(cboEmployeeGender.getSelectedIndex()!=-1)
        {
            String gender;
            gender=cboEmployeeGender.getSelectedItem().toString();
            em.setEmployeeGender(gender);
        }
        model.addElement(em);
    }

    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=300, height=200
        frame.setSize(300,380);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
