package swim;

class NoWaterException extends RuntimeException {

    public NoWaterException(String message) {
        super(message); // e.g., "Cannot swim without water!"
    }
}

interface Swimmer {

    void swim(); // May throw NoWaterException (unchecked, no need to declare)
}

abstract class Animal {

    public abstract void eat();

    public void sleep() {
        System.out.println("ANimal is sleeping");
    }

}

class Dolphin extends Animal implements Swimmer {

    private boolean hasWater;

    public Dolphin(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public void eat() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public void swim() {
        if (!hasWater) {
            throw new NoWaterException("Dolphin cannot swim without water!");
        }
        System.out.println("Dolphin is swimming 🐬");
    }
}
