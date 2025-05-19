import javax.swing.*;
import java.awt.event.*;

public class ShumezimiRekursiv extends JFrame {
    private JTextField numri1Field;
    private JTextField numri2Field;
    private JButton shumezoButton;
    private JLabel rezultatiLabel;

    public ShumezimiRekursiv() {
        setTitle("Shumezim Rekursiv");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Numri 1:");
        label1.setBounds(30, 20, 80, 25);
        add(label1);

        numri1Field = new JTextField();
        numri1Field.setBounds(100, 20, 100, 25);
        add(numri1Field);

        JLabel label2 = new JLabel("Numri 2:");
        label2.setBounds(30, 60, 80, 25);
        add(label2);

        numri2Field = new JTextField();
        numri2Field.setBounds(100, 60, 100, 25);
        add(numri2Field);

        shumezoButton = new JButton("Shumezo");
        shumezoButton.setBounds(100, 100, 100, 30);
        add(shumezoButton);

        rezultatiLabel = new JLabel("Rezultati:");
        rezultatiLabel.setBounds(100, 140, 200, 25);
        add(rezultatiLabel);

        shumezoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(numri1Field.getText());
                    int b = Integer.parseInt(numri2Field.getText());
                    int rezultat = shumezimRekursiv(a, b);
                    rezultatiLabel.setText("Rezultati: " + rezultat);
                } catch (NumberFormatException ex) {
                    rezultatiLabel.setText("Ju lutem jepni numra te vlefshem.");
                }
            }
        });
    }

    public int shumezimRekursiv(int a, int b) {
        if (b == 0) return 0;
        if (b > 0) return a + shumezimRekursiv(a, b - 1);
        return -shumezimRekursiv(a, -b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ShumezimiRekursiv().setVisible(true);
        });
    }
}
