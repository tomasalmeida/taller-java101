package org.vigojug.car.factory;

import org.vigojug.car.Car;

public class Factory {

    public static String getProductType() {
        return "Car";
    }

    public Car produce() {
        return new Car(1, 2018);
    }

    public final String getOwner() {
        return "Un servidor";
    }

}
