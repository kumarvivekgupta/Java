import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/28/2017.
 */
public class Address {
    private JPanel jpanel;
    private JTextField addressLine1;
    private JTextField addressLine2;
    private JTextField city;
    private JTextField state;
    private JTextField pin;
    private JButton submit;
    public static String add;
    public static String pincode;

    public Address() {
        JFrame jFrame=new JFrame();
        jFrame.setContentPane(jpanel);
        jFrame.setPreferredSize(new Dimension(600,400));
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
        addressLine1.setText("Address Line 1");
        addressLine2.setText("Address Line 2");
        city.setText("City");
        state.setText("State");
        pin.setText("Pin-Code");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addressLine1.getText().toString().equals("Address Line 1")||
                        addressLine2.getText().toString().equals("Address Line 2")||
                        city.getText().toString().equals("City")||
                        state.getText().toString().equals("State")||
                        pin.getText().toString().equals("Pin-Code"))
                    JOptionPane.showMessageDialog(jFrame,"Please enter valid information!!");
                else {
                    add = addressLine1.getText().toString() +
                           ",\n" + addressLine2.getText().toString() +
                            ",\n" + city.getText().toString() +
                            ",\n" + state.getText().toString();
                    pincode = "Pin-Code- " + pin.getText().toString();
                    System.out.println(add + "\n" + pincode);
                    Summary summary = new Summary();
                    jFrame.setVisible(false);
                }

            }
        });
    }
}
