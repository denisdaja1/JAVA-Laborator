import java.awt.*;
import javax.swing.*;

public class Telefon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Telefon");
        JTextField field = new JTextField();
        JPanel panel = new JPanel(new GridLayout(4, 3));
        String[] buttons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "*", "#"};

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(e -> field.setText(field.getText() + b));
            panel.add(btn);
        }

        field.setBounds(20, 180, 200, 30);
        panel.setBounds(20, 20, 200, 150);

        frame.add(panel);
        frame.add(field);
        frame.setSize(250, 270);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
