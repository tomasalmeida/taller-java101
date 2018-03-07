package org.vigojug.zoo.people.visitors;

import org.vigojug.zoo.people.Person;

public abstract class Visitor implements Person {

    public boolean paysFee() {
        return true;
    }

}
