package zombieDefense;

public class Armas extends Items{
 
//los stats y nombre se guardan en la clase padre Items



Armas(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, String nombre){

    super(maxvida, vida, ataque, magia, defensa, suerte, costo, nombre);
}

Armas(){

    super();
}

public Armas Armas_Bob_el_constructor(int proyecto) { // construye las armas segun sus stats determinados segun un numero de referencia
    
    Armas ID;

    switch (proyecto) { // cada valor de estas armas debe ser remplazado por su valor de api
        case 0:
        ID = new Armas();
            break;
        case 1:
        ID = new Armas(10, 0, 10, 100, 20, 40, 700, "Durandal");

            break;
        case 2:
        ID = new Armas(100, 0, 50, 0, 20, 25, 500, "Akali");
            break;
        case 3:
        ID = new Armas(0, 0, 0, 500, -40, 10, 1000, "Anivia");
            break;
        case 4:
        ID = new Armas(250, 0, 50, 25, 25, 25, 300, "Excalibur");    
            break;
        case 5:
        ID = new Armas(10, 0, 20, 0, 0, 0, 100, "Espada Larga");
            break;
        default:
        ID = new Armas(-1, -1, -1, -1, -1, -1, -1, "Error");
            break;
    }

    return ID;

}


public void Armas_EfectosEspeciales(){ // metodos disponibles en caso de que se implementen funciones especiales para las armas a futuro

}








}
