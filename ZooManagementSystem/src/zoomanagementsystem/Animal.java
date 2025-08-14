package zoomanagementsystem;

public abstract class Animal implements Feedable {

    private int id;
    private String name;
    private int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();

    public abstract String getFoodType();
    
    public String toString(){
        return "name: "+getName()+"age: "+getAge()+"ID :"+getId();
    }
}
