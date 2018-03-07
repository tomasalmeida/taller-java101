
public class Carrera {


    void empezarCarrera(Corredor[] corredores) {

        for(  int i  = 0; i < corredores.length; i++ ) {
            corredores[i].corre();
        }

    }

}