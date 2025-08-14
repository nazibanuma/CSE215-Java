package zoomanagementsystem;

public class Lion extends Animal {

    public Lion(int id, String name, int age) {
        super(id, name, age);
    }

    public void makeSound() {
        System.out.println("Lion RAWRRRR");
    }

    public String getFoodType() {
        String food = "Eats Meat";
        System.out.println(food);
        return food;
    }

}
