package classy;

import canFly.CanFly;

public class Penguins extends Animals implements CanFly {
    public Penguins() {
    }

    public Penguins(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void canFly() {
        System.out.println("не умеют летать");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
