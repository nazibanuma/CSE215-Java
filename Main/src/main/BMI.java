package main;

public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        int age =20;
    }

    public double getBMI() {
        double bmi = (weight / Math.pow(height,2));
        return bmi;
    }

    public String getStatus() {
        String z;
        double y = getBMI();
        if (y <= 23.9) {
            z = "Underweight";
        } else if (y == 24) {
            z = "Normal";
        } else {
            z = "Overweight";
        }
        return z;
    }
}
