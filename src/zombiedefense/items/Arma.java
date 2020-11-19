package zombiedefense.items;

public class Arma extends Item{
 
    //los stats y nombre se guardan en la clase padre Items

    public Arma(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, int ruido, int alcance, String nombre){

        super(maxvida, vida, ataque, magia, defensa, suerte, costo, ruido, alcance, nombre);
    }

    public Arma(){

        super();
    }

    public Arma Armas_Bob_el_constructor(int proyecto) { // construye las armas segun sus stats determinados segun un numero de referencia

        Arma ID;

        switch (proyecto) { // cada valor de estas armas debe ser remplazado por su valor de api
            case 0:
            ID = new Arma(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Sona");
                break;
            case 1:
            ID = new Arma(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Durandal");
                break;
            case 2:
            ID = new Arma(100, 0, 50, 0, 20, 25, 500, 2, 1, "Espada Akali");
                break;
            case 3:
            ID = new Arma(0, 0, 0, 500, -40, 10, 1000, 2, 1, "Espada Anivia");
                break;
            case 4:
            ID = new Arma(250, 0, 50, 25, 25, 25, 300, 2, 1, "Espada Excalibur");    
                break;
            case 5:
            ID = new Arma(10, 0, 20, 0, 0, 0, 100, 2, 1, "Espada Lux");
                break;
            default:
            ID = new Arma(-1, -1, -1, -1, -1, -1, -1, -1, -1, "Error");
                break;
        }

        return ID;

    }


    public void Armas_EfectosEspeciales(){ // metodos disponibles en caso de que se implementen funciones especiales para las armas a futuro

    }

}