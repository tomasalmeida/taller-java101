package org.vigojug.optionals.models;

import java.time.Instant;

public class CarFactory {

    public Car produces() {
        Instant instant = Instant.now();

        if (instant.getNano() % 11 != 0 ) {
            return new Car("white", 2018);
        } else {
            return null;
        }
    }
}
