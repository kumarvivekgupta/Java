import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 3/1/2017.
 */
public class LoginForm implements ActionListener {
    static JButton o61;
    static JButton o62;
    static JLabel o3;
    static String s1 = "", s2 = "";
    static String s3[];
    public static void main(String[] args) {

            JFrame o1 = new JFrame("LOGIN FORM");
            o1.setVisible(true);
            JPanel o2 = new JPanel();
            o2.setPreferredSize(new Dimension(700, 700));
            o1.setContentPane(o2);
            o1.pack();
            o1.setVisible(true);
            o3 = new JLabel("USER NAME");
            s1 = o3.getText();
            o1.add(o3);
            JTextField o5 = new JTextField();
            o5.setBounds(10, 10, 10, 10);
            o1.add(o5);
            o5.setVisible(true);
            o3 = new JLabel("PASSWORD");
            o3.setBounds(10, 100, 10, 10);
            s2 = o3.getText();
            o1.add(o3);
            o61 = new JButton("LOGIN");
            o62 = new JButton("SIGNUP");

            o2.add(o61);
            o61.setVisible(true);
            o2.add(o62);
            o62.setVisible(true);
            o61.addActionListener(new LoginForm());
            o62.addActionListener(new LoginForm());
        }

        @Override
        public void actionPerformed (ActionEvent e){
            if (e.getSource() == "LOGIN") {
                System.out.println(s1 + " " + s2);

            }


        }
    }
}