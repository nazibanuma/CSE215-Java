package calculate;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateClick {
    
    private static int count = 0;
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Click Count!!");
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        frame.setLayout(new GridLayout(2, 1));
        
        JLabel label = new JLabel("Click count: 0 times", SwingConstants.CENTER);
        frame.add(label);
        label.setForeground(Color.red);
        label.setOpaque(true);
        label.setBackground(Color.blue);
        label.setFont(new Font("Sherif",Font.ITALIC,15));
        
        JButton button = new JButton("Click");
        frame.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Click count: " + count + " times");
                System.out.println("Button clicked!");
            }
        });

//     button.addActionListener(e -> {
//    count++;
//    label.setText("Click count: " + count + " times");
//    System.out.println("The button was clicked!");
//});
    }

//    private class ClickButtonHandler implements ActionListener {
//
//        public void actionPerformed(ActionEvent e) {
//            count++;
//            System.out.println("The button was clicked " + count + " times");
//        }
//    }
}
