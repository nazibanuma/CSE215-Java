package zoomanagementsystem;

public class Elephant extends Animal {

    public Elephant(int id, String name, int age) {
        super(id, name, age);
    }

    public void makeSound() {
        System.out.println("Lion RAWRRRR");
    }

    public String getFoodType() {
        String food = "Eats Plants";
        System.out.println(food);
        return food;
    }

}
