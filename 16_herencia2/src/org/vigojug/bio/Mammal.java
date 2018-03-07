package org.vigojug.bio;

public abstract class Mammal extends Animal {

    public Mammal(final int age, final String name) {
        super(age, name);
    }

    public abstract void breastfeed(Mammal son);

}
