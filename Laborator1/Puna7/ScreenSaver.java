import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class ScreenSaver extends JPanel {

    private int lineCount = 0;
    private final int maxLines = 100;
    private final Random random = new Random();
    private boolean showMessage = false;

    public ScreenSaver() {
        Timer timer = new Timer(50, e -> repaint());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        if (lineCount == 0) {
            g2.setColor(Color.WHITE);
            g2.fillRect(0, 0, getWidth(), getHeight());
            showMessage = true;
        }

        g2.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

        int x1 = random.nextInt(getWidth());
        int y1 = random.nextInt(getHeight());
        int x2 = random.nextInt(getWidth());
        int y2 = random.nextInt(getHeight());

        g2.drawLine(x1, y1, x2, y2);

        if (showMessage) {
            g2.setColor(Color.BLACK);
            g2.drawString("u bene 100 vija, po filloj nga e para", 20, 20);
            showMessage = false;
        }

        lineCount++;

        if (lineCount >= maxLines) {
            lineCount = 0;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Screen Saver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new ScreenSaver());
        frame.setVisible(true);
    }
}