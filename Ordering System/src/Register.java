import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/24/2017.
 */

public class Register {
    private JPanel jpanel;
    private JTextField name;
    private JTextField textField1;
    private JPasswordField password1;
    private JPasswordField password2;
    private String uname;
    private String p1;
    private String p2;
    private String user;
    private String namearr[]=new String[1000];
    private static String userarray[]=new String[1000];
    private static String pass[]=new String[1000];
    private static int count=0;
    JFrame jFrame;



    private JButton done;

    public Register() {

        jFrame=new JFrame();
        jFrame.setContentPane(jpanel);
        jFrame.setPreferredSize(new Dimension(300,300));
        jFrame.pack();
        jFrame.setResizable(false);
        GOBACKTOLOGINButton.setVisible(false);
        jFrame.setVisible(true);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uname=name.getText().toString();
                user=textField1.getText().toString();
                p1=password1.getText().toString();
                p2= password2.getText().toString();
                System.out.println(p1+" "+p2);
                if(p1.equals(p2))
                {
                    namearr[count]=uname;
                    userarray[count]=user;
                    pass[count]=p1;
                    JOptionPane.showMessageDialog(jFrame,"REGISTERED SUCCESSFULLY!!");
                    name.setText(null);
                    textField1.setText(null);
                    password1.setText(null);
                    password2.setText(null);
                    count++;
                    GOBACKTOLOGINButton.setVisible(true);
                }
                else

                    JOptionPane.showMessageDialog(jFrame,"PLEASE ENTER THE SAME PASSWORD!!");

            }
        });
        GOBACKTOLOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Welcome o=new Welcome();
                jFrame.setVisible(false);
            }
        });
    }

    private JButton GOBACKTOLOGINButton;

    public static boolean checkForResult(String un,String pas)
    {

        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(userarray[i].equals(un)&&pass[i].equals(pas))
                flag=1;

        }
        if(flag==1)
            return true;
        else
            return false;

    }
}
