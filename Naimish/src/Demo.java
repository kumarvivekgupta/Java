import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by NAIMISH on 2/28/2017.
 */
public class Demo implements ActionListener
{
        static JLabel ob1;
        int c=0;
        public static void main(String[] args) {
        JFrame frame=new JFrame("NAIMISH");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pannel=new JPanel();
        pannel.setPreferredSize(new Dimension(300,200));
        frame.setContentPane(pannel);
        frame.pack();
        frame.setVisible(true);
        ob1=new JLabel("User name");
        String s=ob1.getText();
        pannel.add(ob1);
        ob1.setVisible(true);
        ob1.setForeground(Color.yellow);
        JTextField ob3=new JTextField();
        ob3.setSize(500,100);
        pannel.add(ob3);
        ob3.setVisible(true);
        JButton ob2=new JButton("SUBMIT");
        pannel.add(ob2);
        ob2.addActionListener(new Demo());
        ob2.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(c==0)
        {
        ob1.setForeground(Color.red);
          c=1;}
        else
        {
            ob1.setForeground(Color.yellow);
            c=0;
        }



    }
}
