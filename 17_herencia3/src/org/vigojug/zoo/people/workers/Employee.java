package org.vigojug.zoo.people.workers;

import org.vigojug.zoo.people.Person;

public class Employee implements Person, Worker {

    private int age;

    public Employee(final int age) {
        this.age = isPartner() ? age : 45;
    }

    @Override public int getAge() {
        return age;
    }

    @Override public boolean isAdult() {
        return true;
    }

    @Override public boolean isPartner() {
        return true;
    }
}
