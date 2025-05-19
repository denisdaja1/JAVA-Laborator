import java.awt.*;
import javax.swing.*;
 public class Shtepia extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(204, 153, 102));
        g2.fillRect(150, 150, 200, 150);
        int[] xPoints = {140, 250, 380};
        int[] yPoints = {150, 80, 150};
        g2.setColor(new Color(150, 75, 0));
        g2.fillPolygon(xPoints, yPoints, 3);
        g2.setColor(new Color(102, 51, 0));
        g2.fillRect(230, 210,40, 90);
        g2.setColor(Color.CYAN);
        g2.fillRect(170, 170, 40, 40);
        g2.fillRect(290, 170, 40, 40);
        g2.setColor(Color.black);
        g2.drawRect(170, 170, 40, 40);
        g2.drawRect(290, 170, 40, 40);

        g2.drawLine(170, 190, 210,190);
        g2.drawLine(190, 170, 190,210);
        g2.drawLine(290, 190, 330,190);
        g2.drawLine(310, 170, 310,210);

        g2.setColor(Color.gray);
        g2.fillRect(225, 300, 50, 10);
        g2.fillRect(220, 310, 60, 10);
        g2.fillRect(215, 320, 70, 10);


        
    }
     
    public static void main(String[] args) {
        JFrame frame =new JFrame("Shtepia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        frame.add(new Shtepia());
        frame.setVisible(true);
    }
 }