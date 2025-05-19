

import javax.swing.*;

public class Kalkulator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Makine llogaritese");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextArea area = new JTextArea();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("*");
        JButton div = new JButton("/");
        JButton clear = new JButton("Pastro");

        t1.setBounds(20, 20, 100, 30);
        t2.setBounds(140, 20, 100, 30);
        plus.setBounds(260, 20, 50, 30);
        minus.setBounds(320, 20, 50, 30);
        mult.setBounds(380, 20, 50, 30);
        div.setBounds(440, 20, 50, 30);
        area.setBounds(20, 60, 470, 100);
        clear.setBounds(20, 170, 100, 30);

        frame.add(t1);
        frame.add(t2);
        frame.add(plus);
        frame.add(minus);
        frame.add(mult);
        frame.add(div);
        frame.add(area);
        frame.add(clear);

        plus.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            area.append(a + " + " + b + " = " + (a + b) + "\n");
        });

        minus.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            area.append(a + " - " + b + " = " + (a - b) + "\n");
        });

        mult.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            area.append(a + " * " + b + " = " + (a * b) + "\n");
        });

        div.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            area.append(a + " / " + b + " = " + (a / b) + "\n");
        });

        clear.addActionListener(e -> area.setText(""));

        frame.setSize(530, 260);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

