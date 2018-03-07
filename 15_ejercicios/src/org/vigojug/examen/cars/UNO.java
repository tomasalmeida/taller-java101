package org.vigojug.examen.cars;

import java.util.ArrayList;

public class UNO {

    static public void main(String[] args) {
        Sedan sedan1 = new Sedan(240, 10000, 4);
        Sedan sedan2 = new Sedan(240, 10000, 6);

        Truck truck1 = new Truck(180, 20000, 2500);
        Truck truck2 = new Truck(180, 20000, 1900);

        Ford ford1 = new Ford(220, 30000, 2017, 5000);
        Ford ford2 = new Ford(220, 40000, 2018, 10000);

        Car car1 = new Car(200, 8000);
        Car car2 = new Car(160, 6000);

        ArrayList<Car> listaCoches = new ArrayList<>();
        listaCoches.add(sedan1);
        listaCoches.add(sedan2);
        listaCoches.add(truck1);
        listaCoches.add(truck2);
        listaCoches.add(ford1);
        listaCoches.add(ford2);
        listaCoches.add(car1);
        listaCoches.add(car2);

        for(Car carActual : listaCoches) {
            System.out.println("Precio coche = " + carActual.dimePrecioVenta());
        }

        Car[] listaCoches2 = new Car[] {sedan1, sedan2, truck1, truck2, ford1, ford2, car1, car2};

        for(Car carActual : listaCoches2) {
            System.out.println("Precio coche = " + carActual.dimePrecioVenta());
        }

        for (int i = 0; i < listaCoches.size(); i++) {
            Car carActual = listaCoches.get(i);
            System.out.println("Precio coche = " + carActual.dimePrecioVenta());
        }

    }
}
