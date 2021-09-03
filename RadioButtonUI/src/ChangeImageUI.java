import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeImageUI {
    private JPanel pnMain;
    private JRadioButton radRose;
    private JRadioButton radOrchid;
    private JLabel lblImage;
    private ImageIcon icon;
    JFrame frame;
    public ChangeImageUI()
    {
        frame=new JFrame("Change Image- JRadioButton");
        frame.setContentPane(pnMain);

        ButtonGroup bg=new ButtonGroup();
        bg.add(radRose);
        bg.add(radOrchid);
        //set default image for
        icon=new ImageIcon("images/rose.png");
        lblImage.setIcon(icon);

        radRose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //check if the Rose JRadioButton is checked
                if(radRose.isSelected())
                {
                    icon=new ImageIcon("images/rose.png");
                    lblImage.setIcon(icon);
                }
            }
        });
        radOrchid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //check if the Orchid JRadioButton is checked
                if(radOrchid.isSelected())
                {
                    icon=new ImageIcon("images/orchid.png");
                    lblImage.setIcon(icon);
                }
            }
        });
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
