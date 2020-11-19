package zombiedefense.items;

public class Consumible extends Item{
 
    //los stats y nombre se guardan en la clase padre Items

    public Consumible(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, int ruido, int alcance, String nombre){

        super(maxvida, vida, ataque, magia, defensa, suerte, costo, ruido, alcance, nombre);
    }

    public Consumible(){

        super();
    }

    public Consumible Consumibles_Bob_el_constructor(int proyecto) { // construye los Consumibles segun sus stats determinados segun un numero de referencia

        Consumible ID;

        switch (proyecto) { // cada valor de estos Consumibles debe ser remplazado por su valor de api
            case 0:
            ID = new Consumible(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Sona");
                break;
            case 1:
            ID = new Consumible(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Durandal");
                break;
            case 2:
            ID = new Consumible(100, 0, 50, 0, 20, 25, 500, 2, 1, "Espada Akali");
                break;
            case 3:
            ID = new Consumible(0, 0, 0, 500, -40, 10, 1000, 2, 1, "Espada Anivia");
                break;
            case 4:
            ID = new Consumible(250, 0, 50, 25, 25, 25, 300, 2, 1, "Espada Excalibur");    
                break;
            case 5:
            ID = new Consumible(10, 0, 20, 0, 0, 0, 100, 2, 1, "Espada Lux");
                break;
            default:
            ID = new Consumible(-1, -1, -1, -1, -1, -1, -1, -1, -1, "Error");
                break;
        }

        return ID;

    }


    public void Consumibles_EfectosEspeciales(){ // metodos disponibles en caso de que se implementen funciones especiales para los Consumibles a futuro

    }

}