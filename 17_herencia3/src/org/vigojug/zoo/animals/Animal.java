package org.vigojug.zoo.animals;

public abstract class Animal {

    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();

    public abstract boolean isCarnivore();
}
