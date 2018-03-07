package org.vigojug.examen.cars;

public class Sedan extends Car {

    private int largo;

    public Sedan() {
    }

    public Sedan(final int speed, final double precio, final int largo) {
        super(speed, precio);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(final int largo) {
        this.largo = largo;
    }

    @Override
    public double dimePrecioVenta() {
        if (largo > 5) {
            return super.dimePrecioVenta() * 0.95;
        } else {
            return super.dimePrecioVenta() * 0.9;
        }
    }


    @Override public double dimePrecioSaldo() {
        return dimePrecioVenta() - 250;
    }

    @Override public double pagarImpuesto() {
        return getPrecio() * (Hacienda.PORCENTAJE_Sedan / 100.0);
    }
}
