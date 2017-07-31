import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/17/2017.
 */
public class AdditionUsingForm {
    private  JPanel jp;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JTextField textField3;

    public AdditionUsingForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i = textField1.getText();
                int a = Integer.parseInt(i);
                String j = textField2.getText();
                int b = Integer.parseInt(j);
                int c=a+b;
                String s=Integer.toString(c);
                textField3.setText(s);
            }
        });
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame("Addition Terminal");
        jf.setContentPane(new AdditionUsingForm().jp);
        jf.pack();
        jf.setVisible(true);
    }
}
