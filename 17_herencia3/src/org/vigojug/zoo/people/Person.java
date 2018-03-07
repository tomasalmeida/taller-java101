package org.vigojug.zoo.people;

public interface Person {

    int getAge();

    boolean isAdult();

    default boolean isPartner() {
        return false;
    }

}
