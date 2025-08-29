package counterapp;

import javax.swing.*;
import java.awt.*;

public class CounterApp {

    private static int counting = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter App");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(frame);

        frame.setLayout(new GridLayout(2, 1));

        JLabel count = new JLabel("Count: 0", SwingConstants.CENTER);
        frame.add(count);

        JButton button = new JButton("Increase");
        frame.add(button);

        button.addActionListener(e -> {
            counting++;
            count.setText("Count: " + counting);
        });

        frame.setVisible(true);
    }
}
