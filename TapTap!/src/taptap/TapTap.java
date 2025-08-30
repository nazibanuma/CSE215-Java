package taptap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TapTap {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tap Tap!");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridLayout(3, 2));
        JButton tap1 = new JButton("Tap 1");
        JButton tap2 = new JButton("Tap 2");
        JButton tap3 = new JButton("Tap 3");
        JButton tap4 = new JButton("Tap 4");

        frame.add(tap1);
        frame.add(tap2);
        frame.add(tap3);
        frame.add(tap4);

        JLabel TF = new JLabel("Tapped null",SwingConstants.CENTER);
        frame.add(TF);

        tap1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TF.setText("Tapped 1");
            }
        });

        tap2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TF.setText("Tapped 2");
            }
        });
        tap3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TF.setText("Tapped 3");
            }
        });
        tap4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TF.setText("Tapped 4");
            }
        });
    }

}
