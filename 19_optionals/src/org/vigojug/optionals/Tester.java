package org.vigojug.optionals;

import java.util.Optional;

import org.vigojug.optionals.models.Car;
import org.vigojug.optionals.models.CarFactory;

public class Tester {

    public static void main(String[] args) throws InterruptedException {
        Car oldCar = new Car("green", 1998);

        CarFactory carFactory = new CarFactory();

        for (int i = 0; i < 1000; i++) {
            Car carJava7 = carFactory.produces();

            //Optional<Car> optionalNeverNull = Optional.of(new Car("black", 2019));
            Optional<Car> optionalCar = Optional.ofNullable(carJava7);

            // orElse -> si optional nulo, devuelve el parametro
            // Car car = optionalCar.orElse(oldCar);
            // Car car = carJava7 != null ? carJava7 : oldCar;

            // olElseGet ->  si optional nulo, produce el valor
            // Car car = optionalCar.orElseGet(() -> new Car("blue", 2002));
            // Car car = carJava7 != null ? carJava7 : new Car("blue", 2002);

            // String color = carJava7 != null ? carJava7.getColor() : "no tengo coche";
            // Optional<String> color = optionalCar.map(Car::getColor);
            // System.out.println(i + " - " + color.orElse("no tengo coche"));

            // si optional es nulo, lanza excepción
            // String color = optionalCar
            //                      .map(Car::getColor)
            //                      .orElseThrow(() -> new IllegalArgumentException("color should never be null"));


            //            String color = optionalCar               // Optional<Car>
            //                    .map(Car::getColor)              // Optional<String>
            //                    .filter(c -> "white".equals(c))  // Optional<String> OR Optional.Empty
            //                    .orElse("no tengo coche");  // "white" OR "no tengo coche"
            //java 7
            //            String color = "no tengo coche";
            //            if (carJava7 != null) {
            //                String posibleColor = carJava7.getColor();
            //                if (posibleColor != null && "white".equals(posibleColor)) {
            //                    color = posibleColor;
            //                }
            //            }
            // System.out.println(i + " - " + color);

            Thread.sleep(10);
        }
    }

}
