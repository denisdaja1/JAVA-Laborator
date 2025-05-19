import java.awt.*;
import javax.swing.*;

public class MickeyMouse extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        Graphics2D g2= (Graphics2D)g ;
        int headX=100;
        int headY=100;
        int headDiameter= 200;
        int earDiameter=100;
        int leftEarX= headX -60;
        int leftEarY=headY -60;
        int rightEarx= headX+headDiameter -40;
        int rightEarY=headY-60;
        g2.setColor(Color.black);
        g2.fillOval(headX, headY, headDiameter, headDiameter);
        g2.fillOval(leftEarX, leftEarY, earDiameter, earDiameter);
        g2.fillOval(rightEarx, rightEarY, earDiameter, earDiameter);
    }
    public static void main(String[] args) {
        JFrame frame =new JFrame("Mickey Mouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add( new MickeyMouse());
        frame.setVisible(true);
    }
}
