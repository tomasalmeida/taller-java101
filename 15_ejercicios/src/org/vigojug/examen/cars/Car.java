package org.vigojug.examen.cars;

public class Car implements Hacienda {

    private int speed;

    private double precio;

    public Car() {}

    public Car(final int speed, final double precio) {
        this.speed = speed;
        this.precio = precio;
    }

    public double dimePrecioVenta() {
        return precio;
    }

    public double dimePrecioSaldo() {
        return dimePrecioVenta() - 100;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrecio() {
        return precio;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public void setPrecio(final double precio) {
        this.precio = precio;
    }

    @Override
    public double pagarImpuesto() {
        return precio * (Hacienda.PORCENTAJE_Car / 100.0);
    }
}
