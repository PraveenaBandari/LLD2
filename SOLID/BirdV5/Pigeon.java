package SOLID.BirdV5;

public class Pigeon extends BirdV3 implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying Low");
    }

    @Override
    void makeSound() {

    }
}
