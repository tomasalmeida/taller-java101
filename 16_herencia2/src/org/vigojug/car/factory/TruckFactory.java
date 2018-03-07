package org.vigojug.car.factory;

import org.vigojug.car.Truck;

public class TruckFactory extends Factory {

    public static String getProductType() {
        return "Truck";
    }

    public Truck produce() {
        return new Truck(1, 2018);
    }

    //no compila
//    public String getOwner() {
//        return "ahora soy yo";
//    }
}
