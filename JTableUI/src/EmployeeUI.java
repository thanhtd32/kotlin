import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeUI {
    private JPanel pnTitle;
    private JPanel pnEmployee;
    private JTextField txtEmployeeID;
    private JTextField txtEmployeeName;
    private JComboBox cboEmployeeGender;
    private JPanel pnSouth;
    private JPanel pnButton;
    private JButton btnAdd;
    private JButton btnRemove;
    private JPanel pnListEmployee;
    private JPanel pnMain;
    private DefaultTableModel tableModel;
    private JTable tblEmployee;
    JFrame frame;
    public EmployeeUI()
    {
        frame=new JFrame("Learn JTable");
        frame.setContentPane(pnMain);
        //add item for JCombobox
        cboEmployeeGender.addItem("Woman");
        cboEmployeeGender.addItem("Man");
        //Create the DefaultTableModel object
        tableModel=new DefaultTableModel();
        //add 3 columns for DefaultTableModel
        tableModel.addColumn("Employee ID");
        tableModel.addColumn("Employee Name");
        tableModel.addColumn("Employee Gender");
        //setmodel for JTable
        tblEmployee.setModel(tableModel);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAddNewEmployee();
            }
        });
        tblEmployee.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                showDetailEmployee();
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processRemoveEmployee();
            }
        });
    }
    //remove employee from the JTable
    private void processRemoveEmployee() {
        if(tblEmployee.getSelectedRow()==-1)
            return;
        int row=tblEmployee.getSelectedRow();
        tableModel.removeRow(row);
    }
    //Show detail employee information
    private void showDetailEmployee() {
        if(tblEmployee.getSelectedRow()==-1)
            return;
        int row=tblEmployee.getSelectedRow();
        String id=(String)tblEmployee.getValueAt(row,0);
        String name=(String)tblEmployee.getValueAt(row,1);
        String gender=(String)tblEmployee.getValueAt(row,2);
        txtEmployeeID.setText(id);
        txtEmployeeName.setText(name);
        cboEmployeeGender.setSelectedItem(gender);
    }
    //add new employee
    private void processAddNewEmployee() {
        String id=txtEmployeeID.getText();
        String name=txtEmployeeName.getText();
        String gender="";
        if(cboEmployeeGender.getSelectedIndex()==0)
            gender="Woman";
        else
            gender="Man";
        String[]row={id,name,gender};
        //insert new row
        tableModel.addRow(row);
    }
    //this method uses to show the UI
    public void showUI()
    {
        //set 'X' corner button to close the window
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        //set size for window: width=450, height=430
        frame.setSize(450,430);
        //set centering desktop for the window
        frame.setLocationRelativeTo(null);
        //show the window
        frame.setVisible(true);
    }
}
