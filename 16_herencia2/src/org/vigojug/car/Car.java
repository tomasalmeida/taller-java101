package org.vigojug.car;

public class Car {

    private int color;

    private int year;

    public Car() {
        this(0, 1970);
    }


    public Car(final int color, final int year) {
        this.color = color;
        this.year = year;
    }

    public int getColor() {
        return color;
    }

    public void setColor(final int color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public String toString() {
        return "soy un coche";
    }
}
