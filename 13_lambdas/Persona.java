public class Persona {

    private Bike myBycicle;

    Persona(Bike b) {
        this.myBycicle = b;
    }

    public void andarEnBicicleta() {
        myBycicle.acelera();
    }
}




...
ElectricBike implements Bike;
Bycicle implements Bike;




...
EletricBike eb = new EletricBike();

Bycicle b = new Bycicle();

Persona persona = new Persona(eb);

persona.andarEnBicicleta();