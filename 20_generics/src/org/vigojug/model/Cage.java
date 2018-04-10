package org.vigojug.model;

public class Cage<T extends Animal> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(final T element) {
        this.element = element;
    }

    public void giveFood() {
        element.eat();
    }
}


