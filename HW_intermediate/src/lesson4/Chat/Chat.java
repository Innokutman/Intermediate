package lesson4.Chat;

import javax.swing.*;
import java.awt.*;

public class Chat extends JFrame {

    public Chat() {

        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(550, 400, 600, 600);
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        add(textPanel, BorderLayout.CENTER);

        JPanel enterPanel = new JPanel();
        enterPanel.setLayout(new BorderLayout());
        add(enterPanel, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        textArea.setEnabled(false);
        textArea.setBackground(new Color(19, 19, 19, 255));
        textPanel.add(textArea, BorderLayout.SOUTH);

        JScrollPane ScrollPane = new JScrollPane(textArea);
        textPanel.add(ScrollPane);

        JTextField textField = new JTextField();
        enterPanel.add(textField, BorderLayout.CENTER);
        textField.addActionListener(new TextReciever(textField, textArea));

        JButton button = new JButton("Send");
        button.setBackground(new Color(5, 155, 175));
        enterPanel.add(button, BorderLayout.EAST);
        button.addActionListener(new TextReciever(textField, textArea));

        setVisible(true);

    }
}
