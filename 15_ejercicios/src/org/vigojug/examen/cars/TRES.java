package org.vigojug.examen.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

enum Test {
    TOTO, TATA, TETE;
}

public class TRES {

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
            System.out.println("Saldo coche = " + carActual.dimePrecioSaldo());
            System.out.println("Impuesto coche = " + carActual.pagarImpuesto());
        }

        Optional<String> test = Optional.ofNullable("TOaaTO");
        System.out.println(test.map(Test::valueOf).toString());
    }
}