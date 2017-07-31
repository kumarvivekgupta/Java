import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/24/2017.
 */
public class Welcome {
    private JTextField username;
    private JPasswordField password;
    private JButton login;
    private JPanel panel;
    private JLabel signup;
    private JButton SIGNUPButton;
   private static JFrame jFrame;
   private String uname;
   private String myPass;
    Register obj;
    FirstLook firstLook;



    public Welcome() {
        jFrame=new JFrame();
        jFrame.setContentPane(panel);
        jFrame.setPreferredSize(new Dimension(350,400));
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               uname=username.getText().toString();
               myPass=password.getText().toString();
              boolean result=Register.checkForResult(uname,myPass);
              if(result==true)
//                  System.out.println("success");
              {
                  jFrame.setVisible(false);
                  firstLook = new FirstLook();
              }
              else
                JOptionPane.showMessageDialog(jFrame,"PLEASE ENTER CORRECT USER NAME AND PASSWORD!!");

            }
        });

        SIGNUPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jFrame.setVisible(false);
                 obj=new Register();
            }
        });
    }

    public static void main(String[] args) {
        Welcome o2=new Welcome();
    }

}


