package mapa;

public class Casilla{


    int identidad; // funciona como referencia a la casilla
    int clasificacion; // es el tipo de casilla. normal, obstaculo , limite
    int costoMover;



    public Casilla(int identidad, int clasificacion){

        this.identidad = identidad;
        this.clasificacion = clasificacion;
        if (clasificacion == 1) {
            
            this.costoMover = 1;
        } else {
            
            this.costoMover = 2;
        }
    }

    public int soylimite(){

        if (this.clasificacion == 2) {
            
            return 1;

        } else {
            
            return 0;
        }
    }

    public int penalidadMovimiento(){


        if (this.clasificacion == 1) {
            
            return 1;

        } else {
            
            return 0;
        }
    }


















}






