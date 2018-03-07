package org.vigojug.bio;

public class Person extends Mammal {

    public Person(final int age, final String name) {
        super(age, name);
    }

    public void breastfeed(final Mammal son) {
        System.out.println(getName() + " doy la teta a " + son.getName());
    }

    public void reproduce() {
        System.out.println("fiesta!!!");
    }

    public void eat() {
        System.out.println("chomp chomp");
    }
}
