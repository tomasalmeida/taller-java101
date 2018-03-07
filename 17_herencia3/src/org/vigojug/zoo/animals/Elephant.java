package org.vigojug.zoo.animals;

public class Elephant extends Animal {

    public Elephant(final String name) {
        super(name);
    }

    @Override public void eat() {
        System.out.println("Elephant is eating.");
    }

    @Override public boolean isCarnivore() {
        return false;
    }
}
