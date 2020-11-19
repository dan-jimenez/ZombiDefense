package zombieDefense;
        
public class Personaje {

public String[] equipamento = {"None", "None", "None"}; // arma , armadura
public int nivel; // nivel de personaje
public int maxVida; // numero de referencia 0
public int vida; // numero de referencia 1
public int ataque; // numero de referencia 2
public int magia; // numero de referencia 3
public int defensa; // numero de referencia 4
public int suerte; // numero de referencia 5
public int dinero; // numero de referencia 6
public int cor_x; // cordenada en x
public int cor_y; // cordenada en y
public int[] todos = {this.maxVida, this.vida, this.ataque, this.magia, this.defensa, this.suerte};

public Personaje () { /*inicializa todos los Stats del personaje en 0*/
    
    this.maxVida = 0;
    this.vida = 0;
    this.ataque = 0;
    this.magia = 0;
    this.defensa = 0;
    this.suerte = 0;
    this.dinero = 0;
}

public Personaje (int maxVida, int vida, int ataque, int magia, int defensa, int suerte, int dinero) { //Stats del personaje son los dados
    this.maxVida = maxVida;
    this.vida = vida;
    this.ataque = ataque;
    this.magia = magia;
    this.defensa = defensa;
    this.suerte = suerte;
    this.dinero = dinero;
}

public int getPersonajeStat(int stat){ 
    /*
    Metodo para retornar los stats de los personajes
    Recibe: stat -> numero entero que indica el stat que quiere retornar
    Retorna: INT con el valor del stat que el usuario solicito
    */
    switch (stat) {
        case 0: //maxvida
        return this.maxVida;
        
        case 1: //vida
        return this.vida;
        
        case 2: //ataque
        return this.ataque;
        
        case 3: //magia
        return this.magia;
       
        case 4: //defensa
        return this.defensa;
        
        case 5: //suerte
        return this.suerte;
       
        case 6: //dinero
        return this.dinero;

        default: //nada
            return 0;
    }
}
public String[] getPersonajeEquipamento() { // devuele el nombre de los equipos equipados
    
    return equipamento;
}
public int[] getPersonajeStats(){ // devuelve todos los stats exceptuando el nombre y dinero

    return this.todos;
}

public void setPersonajeStats(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int dinero) { // cambia las estadisticas de un personaje a diferentes valores que deben ser asignados en la llamada
    this.maxVida = maxvida;
    this.vida = vida;
    this.ataque = ataque;
    this.magia = magia;
    this.defensa = defensa;
    this.suerte = suerte;
    this.dinero = dinero;
}

public void personajeCambioStat(boolean tipo, int stat, int cambio){ //sube un stat con true y baja con false. el stat es definido por un numero 0-5(no incluye dinero). Ocupa el numero de cambio

    switch (stat) {
        case 0: // maxvida
            if (tipo) {
            this.maxVida = maxVida + cambio;
            } else {
            this.maxVida = maxVida - cambio;
            }
            break;
        
        case 1: //vida
            if (tipo) {
            this.vida = vida + cambio;
            } else {
            this.vida = vida - cambio;
            }
            break;

        case 2: //ataque
            if (tipo) {
            this.ataque = ataque + cambio;
            } else {
            this.ataque = ataque - cambio;
            }
            break;
        
        case 3: //magia
            if (tipo) {
            this.magia = magia+ cambio;
            } else {
            this.magia = magia - cambio;
            }
            break;

        case 4: //defensa
            if (tipo) {
            this.defensa = defensa + cambio;
            } else {
            this.defensa = defensa - cambio;
            }
            break;
        
        case 5: //suerte
            if (tipo) {
            this.suerte = suerte + cambio;
            } else {
            this.suerte = suerte - cambio;
            }
            break;

        default: //nada
            break;
    }
}

public void personajeEquipar(String nombre, int fEquipo ,int[] fStats){ //guarda el nombre de la armadura/arma y cambios de stats que otorga la misma.

    
    this.equipamento[fEquipo] = nombre;// 0 cambia el nombre de arma y 1 armadura

    for (int i= 0; i<= 5; i++){
        personajeCambioStat(true, i, fStats[i]); //cambia las estadisticas del personaje dependiendo el arma o objeto
    }
}

public void personajeDesequipar(int fEquipo ,int[] fStats){ //revierte los cambios de stats y nombre de la armadura/arma

    this.equipamento[fEquipo] = "None";// 0 cambia el nombre de arma y 1 armadura
    for (int i= 0; i<= 5; i++){
        personajeCambioStat(false, i, fStats[i]); //cambia las estadisticas del personaje dependiendo el arma o objeto
    }
}

public void personajeCambiarDinero(boolean tipo, int cambio){ //sube el dinero con true y baja con false. Ocupa el numero de cambio

    if (tipo) {
    this.dinero = dinero + cambio;
    } else {
    this.dinero = dinero - cambio;
    }
}















}