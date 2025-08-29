package labelbuttonapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelButtonApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label & Button App");
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use GridLayout(3, 2) as per the question
        frame.setLayout(new GridLayout(3, 2)); // 10px gaps

        // === Top row: Labels ===
        JLabel labelApple = new JLabel("Apple", SwingConstants.CENTER);
        JLabel labelOrange = new JLabel("Orange", SwingConstants.CENTER);
        frame.add(labelApple);
        frame.add(labelOrange);

        // === Middle row: Buttons ===
        JButton btnShowApple = new JButton("Show Apple");
        JButton btnShowOrange = new JButton("Show Orange");
        JButton btnClear = new JButton("Clear");
        JButton btnExit = new JButton("Exit");

        // Add buttons in 2 cells using panels to keep them together
        JPanel middlePanel1 = new JPanel(new GridLayout(1, 2));
        middlePanel1.add(btnShowApple);
        middlePanel1.add(btnShowOrange);
        frame.add(middlePanel1);

        JPanel middlePanel2 = new JPanel(new GridLayout(1, 2));
        middlePanel2.add(btnClear);
        middlePanel2.add(btnExit);
        frame.add(middlePanel2);

        // === Bottom row: Message label ===
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        frame.add(messageLabel);

        // === Action Listeners ===
        btnShowApple.addActionListener(e -> {
            String fruit = labelApple.getText();
            messageLabel.setText("You selected: " + fruit);
        });

        btnShowOrange.addActionListener(e -> {
            String fruit = labelOrange.getText();
            messageLabel.setText("You selected: " + fruit);
        });

        btnClear.addActionListener(e -> messageLabel.setText(""));

        btnExit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
