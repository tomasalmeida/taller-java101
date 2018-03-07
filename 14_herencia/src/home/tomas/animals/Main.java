package home.tomas.animals;

import home.tomas.CanSee;
import home.tomas.birds.Airplane;
import home.tomas.birds.Bird;
import home.tomas.birds.CanFly;

public class Main {

    public static void main(String[] args) {
        //        Mammal zorro = new Mammal();
        //
        //        zorro.eat(1);
        //
        //        Animal.describeAnimal();
        //        Mammal.describeAnimal();

        CanFly[] cosasQueVuelan = recuperaTodoLoQueVuela();

        for (CanFly volador : cosasQueVuelan) {
            volador.fly();
        }

    }

    private static CanFly[] recuperaTodoLoQueVuela() {
        return new CanFly[] { new Airplane(), new Bird(10), new Bat() };
    }
}
