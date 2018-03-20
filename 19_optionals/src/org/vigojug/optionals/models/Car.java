package org.vigojug.optionals.models;

public class Car {

    private String color;

    private int year;

    public Car(final String color, final int year) {
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
