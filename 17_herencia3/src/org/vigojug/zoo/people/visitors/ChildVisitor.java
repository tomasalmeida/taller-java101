package org.vigojug.zoo.people.visitors;

public class ChildVisitor extends Visitor {

    private int age;

    public ChildVisitor(final int age) {
        this.age = age;
    }

    @Override public int getAge() {
        return age;
    }

    @Override public boolean isAdult() {
        return false;
    }

    @Override public boolean paysFee() {
        return false;
    }
}
