package classy;

import canFly.CanFly;

public class GoldenEagle extends Animals implements CanFly {
    public GoldenEagle() {
    }

    public GoldenEagle(String name, String color, int age) {
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
