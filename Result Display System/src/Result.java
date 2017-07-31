import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/20/2017.
 */
public class Result {
    private JTextField textField1;
    private JButton b3;
    private JLabel l1;
    private JPanel p2;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private int r;
    private int p;
    private int c;
    private int m;
    private int index;
    private String rl;
    private String ph;
    private String ch;
    private String ma;
    public void Result()
    {
        JFrame jf=new JFrame();
        jf.setContentPane(p2);
        jf.setPreferredSize(new Dimension(350,350));
        jf.setResizable(false);
        jf.setVisible(true);
        jf.pack();
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r=Integer.parseInt(textField1.getText());
                for(int i=0;i<10;i++)
                {
                    if(DataBase.rno[i]==r)
                        index=i;
                }
                int total=DataBase.e1[index]+DataBase.m[index]+DataBase.p[index]+DataBase.c[index]+DataBase.cs[index];
                l1.setText("Roll No. \t"+Integer.toString(DataBase.rno[index]));
                l2.setText("English \t"+Integer.toString(DataBase.e1[index]));
                l3.setText("Maths \t"+Integer.toString(DataBase.m[index]));
                l4.setText("Physics \t"+Integer.toString(DataBase.p[index]));
                l5.setText("Chemistry \t"+Integer.toString(DataBase.c[index]));
                l6.setText("Computer Science \t"+Integer.toString(DataBase.cs[index]));
                l7.setText("Total \t"+total);

            }
        });
    }

}
