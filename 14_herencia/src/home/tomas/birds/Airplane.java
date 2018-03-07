package home.tomas.birds;

import home.tomas.CanSee;

public class Airplane implements CanFly, CanSee {
    public void fly() {
        System.out.println("volando voy en avion");
    }

    public int getMaxMeterHigh() {
        return 100000;
    }

    public void see() {
        System.out.println("mirando desde la cabina");
    }
}
