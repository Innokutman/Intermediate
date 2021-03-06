package lesson4.Chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextReciever implements ActionListener {

    private JTextField textField;
    private JTextArea textArea;

    public TextReciever(JTextField textField, JTextArea textArea) {
        this.textField = textField;
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String massage = String.format("%s\n[%S]: %s", textArea.getText(), dateFormat.format(date), textField.getText());
        textArea.setText(massage);
        textField.setText(null);
        textField.requestFocus();
    }
}