
public class Main {

    public static void main(String[] args) {
        //calling Null constructor
        Circle circle1 = new Circle();
        System.out.println("Circle created with radius " + circle1.getArea());

        //calling  constructor with argument
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle created with radius " + circle2.getArea());

    }
}
