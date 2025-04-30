 
/*Ndërtoni një aplikacion i cili do të përmbajë një frame, me një textArea ku do te
afishohet një tekst. Të shtohen 2 butona: “To Lower Case”, dhe “To Upper Case”
që do te kthejnë tekstin në shkronja të vogla ose të mëdha në varësi të butonit të
zgjedhur.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NdryshoShkronje {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ndrysho Shkronje");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JTextArea textArea = new JTextArea();
        JButton toLowerCaseButton = new JButton("To Lower Case");
        JButton toUpperCaseButton = new JButton("To Upper Case");
        
        toLowerCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                textArea.setText(text.toLowerCase());
            }
        });
        
        toUpperCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                textArea.setText(text.toUpperCase());
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(textArea, BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(toLowerCaseButton);
        buttonPanel.add(toUpperCaseButton);
        
        panel.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setVisible(true);
    }
         
    

    
}
