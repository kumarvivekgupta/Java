import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/17/2017.
 */
public class Details {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JPasswordField passwordField1;
    private JButton SUBMITButton;
    public static String name;
    public static String age;
    public static String em;
    public static String us;
    public static String pas;
       public Details() {
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 name=textField1.getText();
                 age=textField2.getText();
                 em=textField3.getText();
                 us=textField5.getText();
                 pas=passwordField1.getText();
                 Verify o=new Verify();
                o.show();

            }
        });
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame("SIGN UP");
        jf.setContentPane(new Details().panel1);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }
}
