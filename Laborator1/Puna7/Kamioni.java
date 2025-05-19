import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Kamioni extends JPanel implements ActionListener{
    private int x =0;
    private int direction = 1;
    private Timer timer;
    public Kamioni(){
        timer = new Timer(20, this);
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        g.setColor(Color.GRAY);
        g.fillRect(x+50, 100, 150, 60);
        g.setColor(Color.BLUE);
        g.fillRect(x+20, 120, 40, 40);
        g.setColor(Color.CYAN);
        g.fillRect(x+25, 125, 15, 15);
        g.setColor(Color.BLACK);
        g.fillOval(x+30, 160, 20, 20);
        g.fillOval(x+130, 160, 20, 20);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        x+= 2* direction;
        if(x+ 200 > getWidth() || x<0){
            direction*=-1;
        }
        repaint();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kamioni");
        Kamioni panel = new Kamioni();
        frame.add(panel);
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
