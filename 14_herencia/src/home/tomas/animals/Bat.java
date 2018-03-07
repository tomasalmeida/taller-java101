package home.tomas.animals;

import home.tomas.birds.CanFly;

public class Bat extends Mammal implements CanFly {
    @Override public void fly() {
        System.out.println("vuela batman!");
    }

    @Override public int getMaxMeterHigh() {
        return 100;
    }
}
