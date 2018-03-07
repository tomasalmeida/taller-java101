package org.vigojug.zoo.animals;

public class Monkey extends Animal {

    public Monkey(final String name) {
        super(name);
    }

    @Override public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override public boolean isCarnivore() {
        return true;
    }
}
