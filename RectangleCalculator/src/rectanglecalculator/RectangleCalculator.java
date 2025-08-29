package rectanglecalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

public class RectangleCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(5, 2));

        JLabel lengthL = new JLabel("length: ", SwingConstants.CENTER);
        frame.add(lengthL);
        JTextField lengthTF = new JTextField();
        frame.add(lengthTF);
        JLabel widthL = new JLabel("width: ", SwingConstants.CENTER);
        frame.add(widthL);
        JTextField widthTF = new JTextField();
        frame.add(widthTF);
        JLabel areaL = new JLabel("area: ", SwingConstants.CENTER);
        frame.add(areaL);
        JTextField areaTF = new JTextField();
        areaTF.setEditable(false);
        frame.add(areaTF);
        JLabel perimeterL = new JLabel("perimeter: ", SwingConstants.CENTER);
        frame.add(perimeterL);
        JTextField perimeterTF = new JTextField();
        perimeterTF.setEditable(false);
        frame.add(perimeterTF);

        JButton calculateA = new JButton("Calulate Area");
        frame.add(calculateA);
        JButton calculateP = new JButton("Calulate Perimeter");
        frame.add(calculateP);

        calculateA.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int width = Integer.parseInt(widthTF.getText());
                int length = Integer.parseInt(lengthTF.getText());
                int area = width * length;

                areaTF.setText(Integer.toString(area));
            }
        });

         calculateA.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double width = Double.parseDouble(widthTF.getText());
                double length = Double.parseDouble(lengthTF.getText());
                double perimeter = 2*(width + length);

                perimeterTF.setText(Double.toString(perimeter));
            }
        });
         
         
        calculateP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                frame.dispose();
                 System.exit(0);
            }
        });
    }

}
