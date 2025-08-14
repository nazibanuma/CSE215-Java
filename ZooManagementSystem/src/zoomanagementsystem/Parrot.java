package zoomanagementsystem;

public class Parrot extends Animal {

    public Parrot(int id, String name, int age) {
        super(id, name, age);
    }

    public void makeSound() {
        System.out.println("Parrot ieeeee");
    }

    public String getFoodType() {
        String food = "Eats seeds";
        System.out.println(food);
        return food;
    }

}
