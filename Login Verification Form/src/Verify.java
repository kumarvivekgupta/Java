import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/17/2017.
 */
public class Verify {
    private JPanel panel1;
    private JTextField textField1;
    private JButton VERIFYButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public void show()
    {

        JFrame jf1=new JFrame("Verification Screen");
        jf1.setContentPane(panel1);
        jf1.pack();
        jf1.setVisible(true);
        textField1.setText(Details.name);
        textField2.setText(Details.age);
        textField3.setText(Details.em);
        textField4.setText(Details.us);
        textField5.setText(Details.pas);
        jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
        VERIFYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jf1,"YOU HAVE SUCCESFULLY SUBMITTED YOUR DETAILS");
            }
        });
    }
}
