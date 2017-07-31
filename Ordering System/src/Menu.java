import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itakg on 7/27/2017.
 */
public class Menu {
    private JPanel jpanel;
    private JCheckBox plain;
    private JCheckBox jeera;
    private JCheckBox plainR;
    private JCheckBox tandoor;
    private JCheckBox butterR;
    private JCheckBox garlic;
    private JCheckBox butternaan;
    private JCheckBox gulab;
    private JCheckBox kheer;
    private JCheckBox jalebi;
    private JCheckBox shahi;
    private JCheckBox butter;
    private JCheckBox mushroom;
    private JCheckBox tava;
    private JCheckBox chole;
    private JCheckBox daal;
    private JCheckBox makhani;
    private JCheckBox vanillaI;
    private JCheckBox butterI;
    private JCheckBox chocolateI;
    private JCheckBox sunday;
    private JCheckBox kadhai;
    private JCheckBox handi;
    private JCheckBox palak;
    private JCheckBox matar;
    private JCheckBox mix;
    private JCheckBox kofta;
    private JCheckBox allo;
    private JCheckBox tikka;
    private JCheckBox momos;
    private JCheckBox chilli;
    private JCheckBox pasta;
    private JCheckBox sandwich;
    private JCheckBox maggi;
    private JCheckBox spring;
    private JCheckBox chocolate;
    private JCheckBox strawberry;
    private JCheckBox vanilla;
    private JCheckBox apple;
    private JCheckBox litchi;
    private JCheckBox oreo;
    private JCheckBox mango;
    private JButton order;
    public static int total=0;
    public static StringBuffer stringBuffer;

    public Menu() {
        JFrame jFrame=new JFrame();
        jFrame.setContentPane(jpanel);
        jFrame.setPreferredSize(new Dimension(1100,400));
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
        stringBuffer=new StringBuffer();

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(plain.isSelected())
                {
                    stringBuffer.append("Plain Rice.....\tRs.100\n");
                    total+=100;

                }
                if(plainR.isSelected())
                {
                    stringBuffer.append("Plain Roti(5).....\tRs.20\n");
                    total+=20;

                }
                if(jeera.isSelected())
                {
                    stringBuffer.append("Jeera rice.....\tRs.120\n");
                    total+=120;

                }
                if(tandoor.isSelected())
                {
                    stringBuffer.append("Tandoor Roti(5).....\tRs.40\n");
                    total+=40;

                }
                if(butterR.isSelected())
                {
                    stringBuffer.append("Butter Roti(5).....\tRs.30\n");
                    total+=30;

                }
                if(garlic.isSelected())
                {
                    stringBuffer.append("Grlic naam(5).....\tRs.250\n");
                    total+=250;

                }
                if(butternaan.isSelected())
                {
                    stringBuffer.append("Butter naam(5).....\tRs.200\n");
                    total+=200;

                }
                if(gulab.isSelected())
                {
                    stringBuffer.append("Gulab jamun.....\tRs.20\n");
                    total+=20;

                }
                if(kheer.isSelected())
                {
                    stringBuffer.append("Kheer.....\tRs.50\n");
                    total+=50;

                }
                if(jalebi.isSelected())
                {
                    stringBuffer.append("Jalebi.....\tRs.100\n");
                    total+=100;

                }
                if(shahi.isSelected())
                {
                    stringBuffer.append("Shahi paneer.....\tRs.180\n");
                    total+=180;

                }
                if(butter.isSelected())
                {
                    stringBuffer.append("Paneer butter masala.....\tRs.200\n");
                    total+=200;

                }
                if(mushroom.isSelected())
                {
                    stringBuffer.append("Mushroom.....\tRs.210\n");
                    total+=210;

                }
                if(tava.isSelected())
                {
                    stringBuffer.append("Tava paneer.....\tRs.220\n");
                    total+=220;

                }
                if(chole.isSelected())
                {
                    stringBuffer.append("Chole.....\tRs.100\n");
                    total+=100;

                }
                if(daal.isSelected())
                {
                    stringBuffer.append("Daal fry.....\tRs.120\n");
                    total+=120;

                }
                if(makhani.isSelected())
                {
                    stringBuffer.append("Daal Makhani.....\tRs.180\n");
                    total+=180;

                }
                if(vanilla.isSelected())
                {
                    stringBuffer.append("Vanilla shake.....\tRs.30\n");
                    total+=30;

                }
                if(vanillaI.isSelected())
                {
                    stringBuffer.append("Vanilla.....\tRs.30\n");
                    total+=30;

                }
                if(chocolateI.isSelected())
                {
                    stringBuffer.append("Chocolate icecream.....\tRs.50\n");
                    total+=50;

                }
                if(sunday.isSelected())
                {
                    stringBuffer.append("Sundae icecream.....\tRs.60\n");
                    total+=60;

                }
                if(butterI.isSelected())
                {
                    stringBuffer.append("Butterscotch.....\tRs.70\n");
                    total+=70;

                }
                if(kadhai.isSelected())
                {
                    stringBuffer.append("Kadhai paneer.....\tRs.180\n");
                    total+=180;

                }
                if(handi.isSelected())
                {
                    stringBuffer.append("Handi paneer.....\tRs.190\n");
                    total+=190;

                }
                if(palak.isSelected())
                {
                    stringBuffer.append("Palak paneer.....\tRs.150\n");
                    total+=150;

                }
                if(matar.isSelected())
                {
                    stringBuffer.append("Mattar paneer.....\tRs.120\n");
                    total+=120;

                }
                if(mix.isSelected())
                {
                    stringBuffer.append("Mix veg.....\tRs.100\n");
                    total+=100;

                }
                if(kofta.isSelected())
                {
                    stringBuffer.append("Veg. kofta.....\tRs.130\n");
                    total+=130;

                }
                if(allo.isSelected())
                {
                    stringBuffer.append("Jeera allo.....\tRs.80\n");
                    total+=80;

                }
                if(tikka.isSelected())
                {
                    stringBuffer.append("Paneer tikka.....\tRs.120\n");
                    total+=120;

                }
                if(chilli.isSelected())
                {
                    stringBuffer.append("Chilli potato.....\tRs.50\n");
                    total+=50;

                }
                if(momos.isSelected())
                {
                    stringBuffer.append("Momos.....\tRs.30\n");
                    total+=30;

                }
                if(pasta.isSelected())
                {
                    stringBuffer.append("Pasta.....\tRs.40\n");
                    total+=40;

                }
                if(sandwich.isSelected())
                {
                    stringBuffer.append("Plain Sandwich.....\tRs.20\n");
                    total+=20;

                }
                if(maggi.isSelected())
                {
                    stringBuffer.append("Maggi.....\tRs.40\n");
                    total+=40;

                }
                if(spring.isSelected())
                {
                    stringBuffer.append("Spring roll.....\tRs.45\n");
                    total+=45;

                }
                if(chocolate.isSelected())
                {
                    stringBuffer.append("Chocolate shake.....\tRs.60\n");
                    total+=60;

                }
                if(strawberry.isSelected())
                {
                    stringBuffer.append("Strawberry shake.....\tRs.50\n");
                    total+=50;

                }
                if(apple.isSelected())
                {
                    stringBuffer.append("Apple drink.....\tRs.70\n");
                    total+=70;

                }
                if(litchi.isSelected())
                {
                    stringBuffer.append("Litchi drink.....\tRs.45\n");
                    total+=45;

                }
                if(oreo.isSelected())
                {
                    stringBuffer.append("Oreo shake.....\tRs.40\n");
                    total+=40;

                }
                if(mango.isSelected())
                {
                    stringBuffer.append("Mango shake.....\tRs.40\n");
                    total+=40;

                }


//                System.out.println(stringBuffer.toString());
//                System.out.println(total);
                jFrame.setVisible(false);
                Address address=new Address();


            }
        });
    }
}
