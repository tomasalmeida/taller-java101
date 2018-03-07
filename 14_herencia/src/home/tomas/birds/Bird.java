package home.tomas.birds;

import home.tomas.CanSee;

public class Bird implements CanFly, CanSee {
    private int maxMeterHigh;

    public Bird(int max) {
        this.maxMeterHigh = max;
    }

    public void fly() {
        System.out.println("volando voy pajarito");
    }

    public int getMaxMeterHigh() {
        return this.maxMeterHigh;
    }

    public void see() {
        System.out.println("mirando voy");
    }
}
