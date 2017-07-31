import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 6/20/2017.
 */
public class DataBase {
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JButton b1;
    private JButton b2;
    private JPanel jp;
    private JTextField t5;
    private JTextField t6;
    private int r=0;
    private  int cr=0;
    private  int cp=0;
    private  int cc=0;
    private  int cm=0;
    private  int ce=0;
    private  int ccs=0;
    public static int rno[]=new int[1000];
    public static int p[]=new int[1000];
    public static int c[]=new int[1000];
    public static int m[]=new int[1000];
    public static int e1[]=new int[1000];
    public static int cs[]=new int[1000];

    public DataBase() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               r=Integer.parseInt(t1.getText());
                rno[cr++]=r;
                p[cp++]=Integer.parseInt(t2.getText());
                c[cc++]=Integer.parseInt(t3.getText());
                m[cm++]=Integer.parseInt(t4.getText());
                 e1[ce++]=Integer.parseInt(t5.getText());
                cs[ccs++]=Integer.parseInt(t6.getText());
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
                t6.setText(null);


            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Result r=new Result();
                r.Result();
            }
        });
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setContentPane(new DataBase().jp);
        jf.setResizable(true);
        jf.setVisible(true);
        jf.pack();
    }
}
