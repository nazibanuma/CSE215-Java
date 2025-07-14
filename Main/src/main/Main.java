package main;

public class Main {

    public static void main(String[] args) {
        BMI bmi1 = new BMI("numa", 300, 190, 360);

        System.out.println("the bmi of numa:" + bmi1.getBMI());
        System.out.println("numa's status: :" + bmi1.getStatus());

        BMI bmi2 = new BMI("nuha", 345, 1234);

        System.out.println("the bmi of numa:" + bmi2.getBMI());
        System.out.println("numa's status: :" + bmi2.getStatus());

    }
}
