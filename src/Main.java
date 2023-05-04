import classy.*;

public class Main {
    public static void main(String[] args) {
        GoldenEagle goldenEagle = new GoldenEagle("suzi", "white", 1);
        System.out.println(goldenEagle);
        goldenEagle.canFly();
        Raven raven = new Raven("kai", "blake", 2);
        System.out.println(raven);
        raven.canFly();
        Penguins penguins = new Penguins("Lolo", "black and white", 1);
        System.out.println(penguins);
        penguins.canFly();
        Ostriches ostriches = new Ostriches("Straus", "seryi", 3);
        System.out.println(ostriches);
        ostriches.canFly();
        Pigeon pigeon = new Pigeon("Pepe", "blue", 2);
        System.out.println(pigeon);
        pigeon.canFly();

    }
}