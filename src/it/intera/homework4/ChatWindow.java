package it.intera.homework4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class ChatWindow extends JFrame {

    ChatWindow() {

        setTitle("My Super Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(textArea);
        add(jsp, BorderLayout.CENTER);

        JPanel panel_bottom = new JPanel(new BorderLayout());
        JButton button = new JButton("Отправить");
        JTextField textField = new JTextField();

        panel_bottom.add(button, BorderLayout.EAST);
        panel_bottom.add(textField, BorderLayout.CENTER);


        add(panel_bottom, BorderLayout.SOUTH);

        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = textField.getText()+"\n";
                textArea.append(message);
                textField.setText(null);
            }
        });

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String message = textField.getText()+"\n";
                    textArea.append(message);
                    textField.setText(null);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
