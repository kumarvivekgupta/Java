import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by NAIMISH on 6/20/2017.
 */
public class Calculator {
    private String s="";
    private String u="";
    private String o="";
    private String b="";
    private String ans="";
    private double n1=0.0d;
    private double n2=0.0d;
    private double n3=0.0d;
    private JPanel jp;
    private JTextField t;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton equals;
    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton back;
    private JButton clear;
    private JButton btn0;
    private JButton button1;

    public Calculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"1";
                t.setText(s);

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"2";
                t.setText(s);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"3";
                t.setText(s);

            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"4";
                t.setText(s);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"5";
                t.setText(s);

            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                s=s+"6";
                t.setText(s);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"7";
                t.setText(s);

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"8";
                t.setText(s);

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"9";
                t.setText(s);

            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+"0";
                t.setText(s);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s=s+".";
                t.setText(s);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                o="+";
                u=s;
                s="";
                t.setText(o);

            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                o="-";
                u=s;
                s="";
                t.setText(o);

            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                o="*";
                u=s;
                s="";
                t.setText(o);

            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                o="/";
                u=s;
                s="";
                t.setText(o);

            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=b+s.substring(0,s.length()-1);
                s=b;
                t.setText(s);
                b="";

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s="";
                t.setText(null);

            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(o=="+")
                {
                    n1=Double.parseDouble(u);
                    n2=Double.parseDouble(s);
                    n3=n1+n2;
                    s=Double.toString(n3);
                    ans=Double.toString(n3);
                    t.setText(ans);
                }
                else if(o=="-")
                {
                    n1=Double.parseDouble(u);
                    n2=Double.parseDouble(s);
                    n3=n1-n2;
                    s=Double.toString(n3);
                    ans=Double.toString(n3);
                    t.setText(ans);
                }
               else if(o=="*")
                {
                    n1=Double.parseDouble(u);
                    n2=Double.parseDouble(s);
                    n3=n1*n2;
                    s=Double.toString(n3);
                    ans=Double.toString(n3);
                    t.setText(ans);
                }
                else
                {
                    n1=Double.parseDouble(u);
                    n2=Double.parseDouble(s);
                    n3=n1/n2;
                    s=Double.toString(n3);
                    ans=Double.toString(n3);
                    t.setText(ans);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setContentPane(new Calculator().jp);
        jf.setPreferredSize(new Dimension(200,270));
        jf.setResizable(false);
        jf.setVisible(true);
        jf.pack();
       }
}
