import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame  extends Frame {

    int x=200;
    int y=150;


    public  TankFrame(){
        this.setTitle("坦克大战");
        this.setSize(800,600);
        this.setResizable(false);
        this.setVisible(true);
        this.addKeyListener(new MyKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }


    @Override
    public  void paint( Graphics graphics){

        graphics.fillRect(x,y,50,50);
       x+=10;
       y+=10;
    }


    class  MyKeyListener extends KeyAdapter{


        public void keyPressed(KeyEvent e) {
            System.out.println("按下");

        }


        public void keyReleased(KeyEvent e) {

            System.out.println("回弹");
        }


    }
}
