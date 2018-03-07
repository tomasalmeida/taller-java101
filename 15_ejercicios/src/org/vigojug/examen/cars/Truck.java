package org.vigojug.examen.cars;

public class Truck extends Car {

    private int peso;

    public Truck() {
    }

    public Truck(final int speed, final double precio, final int peso) {
        super(speed, precio);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(final int peso) {
        this.peso = peso;
    }

    @Override
    public double dimePrecioVenta() {
       if (peso > 2000) {
           return super.dimePrecioVenta() * 0.9;
       } else {
           return super.dimePrecioVenta() * 0.8;
       }
    }

    @Override public double dimePrecioSaldo() {
        return dimePrecioVenta() - 200;
    }

    @Override public double pagarImpuesto() {
        return getPrecio() * (Hacienda.PORCENTAJE_Truck / 100.0);
    }
}
