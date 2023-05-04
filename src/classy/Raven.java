package classy;

import canFly.CanFly;

public class Raven extends Animals implements CanFly {
    public Raven() {
    }

    public Raven(String name, String color, int age) {
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
