import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJTreeUI {
    private JPanel pnMain;
    private JTree tvDemo;
    private JTextField txtValue;
    private JButton btnAddRoot;
    private JButton btnAddChild;
    private JButton btnRemove;
    private JButton btnExpand;
    private JButton btnCollapse;
    private JPanel pnWest;
    private JPanel pnNorth;
    private JPanel pnCenter;
    JFrame frame;
    public DemoJTreeUI()
    {
        frame=new JFrame("Learn JTree");
        frame.setContentPane(pnMain);

        //Remove all nodes in the tree
        DefaultTreeModel model = (DefaultTreeModel) tvDemo.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        model.reload();
        model.setRoot(null);

        btnAddRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRoot();
            }
        });
        btnAddChild.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addChild();
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeNode();
            }
        });
        btnExpand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expandAll();
            }
        });
        btnCollapse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                collapseAll();
            }
        });
    }
    //collapse all nodes
    private void collapseAll() {
        int row = 0;
        while (row < tvDemo.getRowCount()) {
            tvDemo.collapseRow(row);
            row++;
        }
    }
    //expand all nodes
    public void expandAll() {
        int row = 0;
        while (row < tvDemo.getRowCount()) {
            tvDemo.expandRow(row);
            row++;
        }
    }
    //remove selected node
    private void removeNode() {
        Object obj=tvDemo.getLastSelectedPathComponent();
        if(obj==null)return;
        DefaultTreeModel model =
                (DefaultTreeModel) tvDemo.getModel();
        DefaultMutableTreeNode node =
                (DefaultMutableTreeNode)obj;
        if (node.getParent() != null) {
            model.removeNodeFromParent(node);
        }
        else
        {
            //remove the Root
            DefaultMutableTreeNode root =
                    (DefaultMutableTreeNode) model.getRoot();
            root.removeAllChildren();
            model.reload();
            model.setRoot(null);
        }
    }
    //add a new node
    private void addChild() {
        //get the selected node
        Object obj=tvDemo.getLastSelectedPathComponent();
        if(obj==null)return;
        DefaultMutableTreeNode selectedNode=
                                (DefaultMutableTreeNode)obj;
        //create a new Node:
        String value=txtValue.getText();
        DefaultMutableTreeNode childNode=
                new DefaultMutableTreeNode(value);
        selectedNode.add(childNode);
        //update the UI
        tvDemo.updateUI();
    }
    //add a root
    private void addRoot() {
        DefaultTreeModel model = (DefaultTreeModel) tvDemo.getModel();
        DefaultMutableTreeNode root;
        String value=txtValue.getText();
        root=new DefaultMutableTreeNode(value);
        model.setRoot(root);
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
