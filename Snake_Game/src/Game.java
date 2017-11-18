
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;

/**
 * Created by NAIMISH on 3/6/2017.
 */
public class Game {
    static int score=0;
    static int xvel=0;
    static int yvel=0;
   static int x=5;
    static int y=5;
          static boolean s;
        static int a=0;
    static int b=0;
 static Random random;
       static Graphics graphics;
    public static void main(String[] args) throws InterruptedException, IOException {
        random=new Random();
        Game game=new Game();
       JFrame o1 = new JFrame();

        o1.setResizable(false);
        JPanel pannel = new JPanel();
        pannel.setPreferredSize(new Dimension(500,500));
        o1.setContentPane(pannel);
        o1.pack();
        o1.setVisible(true);
        pannel.setFocusable(true);
            Graphics graphics=pannel.getGraphics();
        Thread.sleep(500);
        graphics.fillRect(x+1,y+1,30,30);
        a=random.nextInt(480);b=random.nextInt(480);
        a=a+10;b=b+10;
    pannel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_RIGHT)
                {
                 xvel=15;
                    yvel=0;
                }
                else if(e.getKeyCode()==KeyEvent.VK_LEFT)
                {
                    xvel=-15;
                    yvel=0;
                }
                else if(e.getKeyCode()==KeyEvent.VK_UP)
                {
                    xvel=0;
                    yvel=-15;
                }
                else if(e.getKeyCode()==KeyEvent.VK_DOWN)
                {
                    xvel=0;
                    yvel=15;
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        while(true)
        {
            Thread.sleep(500);
            graphics.setColor(Color.red);
            graphics.fillRect(0,0,500,5);
            graphics.fillRect(0,495,500,5);
            graphics.fillRect(0,0,5,500);
            graphics.fillRect(495,0,5,500);
            graphics.setColor(Color.gray);
            graphics.clearRect(5,5,490,490);
            graphics.fillRect(5,5,490,490);
            graphics.setColor(Color.blue);
            x=x+xvel;
            y=y+yvel;
            graphics.fillRect(x,y,30,30);
            graphics.fillRect(a,b,20,20);
            s = checkIntersection1();
            if(s==true)
            {
                JOptionPane.showMessageDialog(o1,"GAME OVER YOUR SCORE IS "+score);
                                break;
            }
            checkIntersection2();

        }
    }
   static boolean checkIntersection1()
    {
        if((x<5||x>465)||(y<5||y>465))
            return true;
        else
            return false;
    }
    static void checkIntersection2()
    {
        if(((x+30)>a)&&((x+30)<(a+20))&&((y+30)>b&&y<(b+20)))
        {a=random.nextInt(480);b=random.nextInt(480);score++;}
        else if((y+30)>b&&(y+30)<(b+20)&&(x+30)>a&&x<(a+20))
        { a=random.nextInt(480);b=random.nextInt(480);score++;}
        else if(x>a&&x<(a+20)&&(y+30)>b&&y<(b+20))
        {a=random.nextInt(480);b=random.nextInt(480);score++;}
        else if (y > b && y < (b + 20) && (x + 30) > a && x < (a + 20))
        {a = random.nextInt(480);b = random.nextInt(480);score++;}
        else return;
        }
    }





