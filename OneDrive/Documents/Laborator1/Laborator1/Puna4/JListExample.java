import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList");
        JTextField textField = new JTextField("Vendosni emrin");
        JButton addButton = new JButton("Shto");
        JButton clearButton = new JButton("Pastro");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> list = new JList<>(listModel);

        textField.setBounds(20, 20, 200, 30);
        addButton.setBounds(230, 20, 80, 30);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(20, 60, 290, 100);
        clearButton.setBounds(20, 170, 80, 30);

        frame.add(textField);
        frame.add(addButton);
        frame.add(scrollPane);
        frame.add(clearButton);

        addButton.addActionListener(e -> listModel.addElement(textField.getText()));
        clearButton.addActionListener(e -> listModel.clear());

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
