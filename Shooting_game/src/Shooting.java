import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

/**
 * Created by NAIMISH on 6/15/2017.
 */
public class Shooting {
    public static int gx1=250;
    public static int gx2=257;
    public static int gx3=262;
    public static int gy1=445;
    public static int yv=3;
    public static int a;
    public static int b;
    public static int ci=0;
    public static int score=0;
    public static Graphics graphics;
    public  static Random random;
    public static JFrame JF;
    public static void main(String[] args)throws InterruptedException {
        random=new Random();
        a=random.nextInt(480);
        b=random.nextInt(430);
        a=a+15;
        b=b+5;
        JF = new JFrame();
        JF.setResizable(false);
        JPanel JP=new JPanel();
        JP.setPreferredSize(new Dimension(500,500));
        JF.setContentPane(JP);
        JF.pack();
        JF.setVisible(true);
        JP.setFocusable(true);
        graphics=JP.getGraphics();
        Thread.sleep(500);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(5,5,490,490);
        graphics.setColor(Color.red);
        graphics.fillRect(0,0,5,500);
        graphics.fillRect(0,0,500,5);
        graphics.fillRect(495,0,5,500);
        graphics.fillRect(0,495,500,5);
        gun();
        food();
        JP.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                gx1=gx1-2;
                gx2=gx2-2;
                gun();
                food();
                 }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    gx1=gx1+2;
                    gx2=gx2+2;
                    gun();
                    food();
                }
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                   // gy1=gy1-5;
                    gy1=445;
                    gx3=gx2+5;
                    try {
                        bullet();
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        }
   public static void gun()
    {

if(gx1>5&&gx1<465) {
    graphics.clearRect(5, 5, 490, 490);
    graphics.setColor(Color.GRAY);
    graphics.fillRect(5, 5, 490, 490);
    graphics.setColor(Color.blue);
    graphics.fillRect(gx1, 465, 30, 30);
    graphics.fillRect(gx2, 450, 16, 15);

}
            else
            {
                JOptionPane.showMessageDialog(JF,"CANNOT GO BEYOND THIS BOUNDRY");
            }
    }
    public static void food()
    {
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(a,b,20,20);
    }
    public static void bullet()throws InterruptedException
    {
        while(true)
        {
            food();
            Thread.sleep(10);
            graphics.clearRect(5,5,490,445);
            graphics.setColor(Color.GRAY);
            graphics.fillRect(5, 5, 490, 445);
            graphics.setColor(Color.green);
            graphics.fillRect(gx3,gy1,5,5);
            gy1=gy1-yv;
            ci=checkIntersection();
             if(gy1<10)
             {
                 if(ci==0){
                     JOptionPane.showMessageDialog(JF,"TARGET MISSED, SCORE"+score);break;}
                  food();
                 ci=0;
                  break;
             }

        }
    }
    public static int checkIntersection()
    {

        if((gy1<(b+10)&&gy1>(b-10))&&(gx3<(a+10)&&gx3>(a-10)))
        {
            a=random.nextInt(480);
            b=random.nextInt(430);
            a=a+5;
            b=b+5;
            score=score+10;
            ci=1;
        }

            return ci;
    }
    }
