import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/17/2017.
 */
public class Greet {
    private  JPanel jp;
    private  JRadioButton maleRadioButton;
    private  JRadioButton femaleRadioButton;
    private JTextField textField1;
    private JButton okButton;
    private JTextField textField2;
    private static ButtonGroup b=new ButtonGroup();


    public Greet() {
        b.add(maleRadioButton);
        b.add(femaleRadioButton);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=textField2.getText();
               s= s.toUpperCase();
                if(maleRadioButton.isSelected())
                    textField1.setText("HELLO MR. "+s+" WELCOME TO THE JAVA PROGRAMMING WORLD");
                else
                    textField1.setText("HELLO MRS. "+s+" WELCOME TO THE JAVA PROGRAMMING WORLD");
            }
        });

    }

    public static void main(String[] args) {

        JFrame jf=new JFrame("Addition Terminal");
         jf.setContentPane(new Greet().jp);
        jf.pack();
        jf.setVisible(true);
    }
}
