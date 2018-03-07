package org.vigojug.examen.cars;

public class Ford extends Car {

    private int anho;

    int descuentoFabricante;

    public Ford() {
    }

    public Ford(final int speed, final double precio, final int anho, final int descuentoFabricante) {
        super(speed, precio);
        this.anho = anho;
        this.descuentoFabricante = descuentoFabricante;
    }

    public int getAnho() {
        return anho;
    }

    public int getDescuentoFabricante() {
        return descuentoFabricante;
    }

    public void setAnho(final int anho) {
        this.anho = anho;
    }

    public void setDescuentoFabricante(final int descuentoFabricante) {
        this.descuentoFabricante = descuentoFabricante;
    }

    @Override public double dimePrecioVenta() {
        return super.dimePrecioVenta() - descuentoFabricante;
    }


    @Override public double dimePrecioSaldo() {
        return dimePrecioVenta() - 200;
    }

    @Override public double pagarImpuesto() {
        return getPrecio() * (Hacienda.PORCENTAJE_Ford / 100.0);
    }
}
