package org.vigojug.zoo.people.visitors;

public class AdultVisitor extends Visitor {

    private int age;

    public AdultVisitor(final int age) {
        this.age = age;
    }

    @Override public int getAge() {
        return age;
    }

    @Override public boolean isAdult() {
        return true;
    }
}
