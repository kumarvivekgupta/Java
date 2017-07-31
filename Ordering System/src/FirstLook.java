import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/27/2017.
 */
public class FirstLook
{

    private JLabel title;
    private JPanel jpanel;
    private JCheckBox iAGREETOALLCheckBox;
    private JButton proceed;

    public FirstLook() {
        JFrame jFrame=new JFrame();
        jFrame.setContentPane(jpanel);
        jFrame.setPreferredSize(new Dimension(1000,300));
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
        proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(iAGREETOALLCheckBox.isSelected())
                {
                   jFrame.setVisible(false);
                    Menu menu=new Menu();
                }
                else
                    JOptionPane.showMessageDialog(jFrame,"Please agree to terms and conditions!!");

            }
        });
    }
}
