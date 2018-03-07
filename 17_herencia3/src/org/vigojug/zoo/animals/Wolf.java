package org.vigojug.zoo.animals;

public class Wolf extends Animal {

    public Wolf(final String name) {
        super(name);
    }

    @Override public void eat() {
        System.out.println("wolf is eating");
    }

    @Override public boolean isCarnivore() {
        return true;
    }
}
