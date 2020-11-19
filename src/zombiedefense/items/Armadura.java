package zombiedefense.items;

public class Armadura extends Item{
 
    //los stats y nombre se guardan en la clase padre Items

    public Armadura(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, int ruido, int alcance, String nombre){

        super(maxvida, vida, ataque, magia, defensa, suerte, costo, ruido, alcance, nombre);
    }

    public Armadura(){

        super();
    }

    public Armadura Armaduras_Bob_el_constructor(int proyecto) { // construye las Armaduras segun sus stats determinados segun un numero de referencia

        Armadura ID;

        switch (proyecto) { // cada valor de estas Armaduras debe ser remplazado por su valor de api
            case 0:
            ID = new Armadura(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Sona");
                break;
            case 1:
            ID = new Armadura(10, 0, 10, 100, 20, 40, 700, 2, 1, "Espada Durandal");
                break;
            case 2:
            ID = new Armadura(100, 0, 50, 0, 20, 25, 500, 2, 1, "Espada Akali");
                break;
            case 3:
            ID = new Armadura(0, 0, 0, 500, -40, 10, 1000, 2, 1, "Espada Anivia");
                break;
            case 4:
            ID = new Armadura(250, 0, 50, 25, 25, 25, 300, 2, 1, "Espada Excalibur");    
                break;
            case 5:
            ID = new Armadura(10, 0, 20, 0, 0, 0, 100, 2, 1, "Espada Lux");
                break;
            default:
            ID = new Armadura(-1, -1, -1, -1, -1, -1, -1, -1, -1, "Error");
                break;
        }

        return ID;

    }


    public void Armaduras_EfectosEspeciales(){ // metodos disponibles en caso de que se implementen funciones especiales para las Armaduras a futuro

    }

}