package classy;

import canFly.CanFly;

public class Pigeon extends Animals implements CanFly {
    public Pigeon() {
    }

    public Pigeon(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void canFly() {
        System.out.println("умеют летать");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
