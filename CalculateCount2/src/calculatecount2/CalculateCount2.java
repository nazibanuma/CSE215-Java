package calculatecount2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateCount2 {

    public class CalculateClick {

        private static JFrame frame;
        private static JLabel label;
        private static JButton button;
        private static int count = 0;

        public static void main(String[] args) {

            SimpleGui gui = new SimpleGui();
            gui.run();

        }

        public class SimpleGui {

            public void run() {
                frame = new JFrame("Click Count!!");
                frame.setVisible(true);
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);

                frame.setLayout(new GridLayout(2, 1));

                label = new JLabel("Click count: 0 times", SwingConstants.CENTER);
                frame.add(label);

                button = new JButton("Click");
                frame.add(button);

                button.addActionListener(new ClickButtonHandler());
            }
        }

        private class ClickButtonHandler implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("The button was clicked " + count + " times");

            }
        }
    }
}
