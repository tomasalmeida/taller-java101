package org.vigojug.zoo.people.workers;

public interface Worker {

    default boolean isPartner() {
        return false;
    }
}
