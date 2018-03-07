package org.vigojug.zoo.animals;

public class WhiteWolf extends Wolf {

    public WhiteWolf(final String name) {
        super(name);
    }

    @Override public void eat() {
        System.out.println("White wolf is eating.");
    }
}
