
import java.awt.*;
import javax.swing.*;
public class Rathet extends Canvas{
public void paint(Graphics g){
    int a=200, b=200, x=30;
    for (int i = 0; i < 10; i++) {
       g.drawOval(a, b, x, x);
       a-=20;
       b-=20;
       x+=40; 
    }
}
public static void main(String[]args){
    JFrame frame = new JFrame("Rathe bashkeqendrore");
    Canvas canvas = new Rathet();
    canvas.setSize(500,500);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
}
}

