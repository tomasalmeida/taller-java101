package org.vigojug.bio;

public class Tester {
    public static void main(String[] args) {
        Person madre = new Person(30, "maria");
        Person hijo = new Person(1, "pepito");

        madre.breastfeed(hijo);
    }
}
