import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/28/2017.
 */
public class Summary {
    private JPanel jpanel;
    private JTextArea address;
    private JTextArea ordersummary;
    private JButton GOFORANOTHERORDERButton;

    public Summary() {
        JFrame jFrame=new JFrame();
        jFrame.setContentPane(jpanel);
        jFrame.setPreferredSize(new Dimension(600,400));
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
        address.setText(Address.add);
        ordersummary.setText(Menu.stringBuffer.toString()+"\nTotal Price.............Rs."+Menu.total);
        address.setEditable(false);
        ordersummary.setEditable(false);
        GOFORANOTHERORDERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Welcome welcome=new Welcome();
                jFrame.setVisible(false);

            }
        });
    }
}
