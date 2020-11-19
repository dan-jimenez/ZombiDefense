package zombiedefense.per;

import zombiedefense.personaje.*;

public class Personaje {

    private String[] equipo = {"None", "None", "None"}; // arma , armadura , amuleto(tentativo)
    private int[] habilidades = {0,0,0}; //activacion de las habilidades
    private int maxvida; // numero de referencia 0
    private int vida; // numero de referencia 1
    private int ataque; // numero de referencia 2
    private int magia; // numero de referencia 3
    private int defensa; // numero de referencia 4 // no debe ser mayor a 300; porque no recibe daño
    private int suerte; // numero de referencia 5
    private int ruido; // numero de referencia 6
    private int alcance; // numero de referencia 7
    private int dinero; // numero de referencia 8
    private int cor_x; // numero de referencia 9
    private int cor_y; // numero de referencia 10
    private int nivel; // numero de referencia 11
    private int movimiento; // numero de referencia 12
    private int[] todos = {this.maxvida, this.vida, this.ataque, this.magia, 
                            this.defensa, this.suerte, this.ruido, this.alcance,this.dinero,
                            this.cor_x, this.cor_y, this.nivel, this.movimiento};

    public Personaje () { /*inicializa todos los Stats del personaje en 0*/

        this.maxvida = 0;
        this.vida = 0;
        this.ataque = 0;
        this.magia = 0;
        this.defensa = 0;
        this.suerte = 0;
        this.ruido = 0;
        this.alcance = 0;
        this.dinero = 0;
        this.cor_x = 0;
        this.cor_y = 0;
        this.nivel = 0;
        this.movimiento = 0;
    }
    public Personaje (int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int ruido, 
    int alcance, int dinero, int cor_x, int cor_y, int nivel, int movimiento) { //Stats del personaje son los dados

        this.maxvida = maxvida;
        this.vida = vida;
        this.ataque = ataque;
        this.magia = magia;
        this.defensa = defensa;
        this.suerte = suerte;
        this.ruido = ruido;
        this.alcance =  alcance;
        this.dinero = dinero;
        this.cor_x = cor_x;
        this.cor_y = cor_y;
        this.nivel = nivel;
        this.movimiento = movimiento;
    }

    public int getStat(int stat){ //devuelve el valor de un solo stat. este se define por el numero de 0-11

        switch (stat) {
            case 0: //maxvida
            return this.maxvida;

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
        
            case 6: //ruido
            return this.ruido;

            case 7: //alcance
            return this.alcance;

            case 8: //dinero
            return this.dinero;
        
            case 9: //cor_x
            return this.cor_x;

            case 10: //cor_y
            return this.cor_y;

            case 11: //nivel
            return this.nivel;

            case 12: //nivel
            return this.nivel;

            default: //nada

                return 0;
        }
    }
    public String[] getEquipo() { // devuele el nombre del equipamento actual

        return equipo;
    }
    public int getHabilidades(int numero) { // devuele el estado de la habilidades seleccionada
        
        if (numero > 2) {
            
            return -1;
        } else {
            
        return this.habilidades[numero];
        }
    }
    public int[] getStatTodos(){ // devuelve todos los stats exceptuando el nombre de los items equipados

        return this.todos;
    }

    public void setStatTodos(int maxvida, int vida, int ataque, int magia, int defensa, 
    int suerte, int ruido, int alcance, int dinero, int cor_x, int cor_y, int nivel, int movimiento) { // cambia las estadisticas de un personaje a diferentes valores que deben ser asignados en la llamada

        this.maxvida = maxvida;
        this.vida = vida;
        this.ataque = ataque;
        this.magia = magia;
        this.defensa = defensa;
        this.suerte = suerte;
        this.ruido = ruido;
        this.alcance =  alcance;
        this.dinero = dinero;
        this.cor_x = cor_x;
        this.cor_y = cor_y;
        this.nivel = nivel;
        this.movimiento = movimiento;
    }
    public void setCordenada(int cord_x, int cord_y){

        this.cor_x = 0; //reseteamos cordenada x
        this.cor_y = 0;//reseteamos cordenada y

        cambiarStat(true, 9, cord_x); //nuevo valor de cor_x
        cambiarStat(true, 10, cord_y);//nuevo valor de cor_y

    }

    public void cambiarStat(boolean tipo, int stat, int cambio){ //sube un stat con true y baja con false. el stat es definido por un numero 0-11. Ocupa el numero de cambio

        switch (stat) {
            case 0: // maxvida
                if (tipo) {
                    this.maxvida = maxvida + cambio;
                } else {
                    this.maxvida = maxvida - cambio;
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

            case 6: //ruido
                if (tipo) {
                    this.ruido = ruido + cambio;
                } else {
                    this.ruido = ruido - cambio;
                }
                break;

            case 7: //alcance
                if (tipo) {
                    this.alcance = alcance + cambio;
                } else {
                    this.alcance = alcance - cambio;
                }
                break;

            case 8: //dinero
                if (tipo) {
                    this.dinero = dinero + cambio;
                } else {
                    this.dinero = dinero - cambio;
                }

            case 9: //cord_x
                if (tipo) {
                    this.cor_x = cor_x + cambio;
                } else {
                    this.cor_x = cor_x - cambio;
                }
                break;

            case 10: //cor_y
                if (tipo) {
                    this.cor_y = cor_y + cambio;
                } else {
                    this.cor_y = cor_y - cambio;
                }
                break;

            case 11: //nivel
                if (tipo) {
                    this.nivel = nivel + cambio;
                } else {
                    this.nivel = nivel - cambio;
                }
                break;

            
            case 12: //movimiento
                if (tipo) {
                    this.movimiento = movimiento + cambio;
                } else {
                    this.movimiento = movimiento - cambio;
                }
                break;

            default: //nada
                break;
        }
    }

    public void activarHabilidad(int numero){ // activa la habilida 1/2/3

        switch (numero) {
            case 0: // habilidad 1

                this.habilidades[0] = 1;
                break;
            
            case 1: //habilidad 2
                
                this.habilidades[1] = 1;
                break;

            case 2: //habilidad 3
                
                this.habilidades[2] = 1;
                break;

            default:
                break;

        }

    }

    public void desactivarHabilidad(int numero){ // desactiva la habilidad 1/2/3

        switch (numero) {
            case 0: // habilidad 1

                this.habilidades[0] = 0;
                break;
            
            case 1: //habilidad 2
                
                this.habilidades[1] = 0;
                break;

            case 2: //habilidad 3
                
                this.habilidades[2] = 0;
                break;

            default:
                break;

        }
        
    }

    public void equiparItem(String nombre, int fequipo ,int[] fstats){ //guarda el nombre de la arma/armadura/amuleto y cambios de stats que otorga la misma.


        this.equipo[fequipo] = nombre;// 0 cambia el nombre de arma, 1 armadura, 2 amuleto

        for (int i= 0; i<= 7; i++){
            cambiarStat(true, i, fstats[i]); //cambia las estadisticas del personaje dependiendo el arma o objeto
        }
    }

    public void desequiparItem(int fequipo ,int[] fstats){ //revierte los cambios de stats y nombre de la arma/armadura/amuleto

        this.equipo[fequipo] = "None";// 0 cambia el nombre de arma, 1 armadura y 2 amuleto
        for (int i= 0; i<= 7; i++){
            cambiarStat(false, i, fstats[i]); //cambia las estadisticas del personaje dependiendo el arma o objeto
        }
    }

    public int atacarMagia(double defenzaEnemiga){ // ataca con la magia y retorna el daño inflingido

        double temp = getStat(3);

        temp = temp - (temp*defenzaEnemiga);
        return (int) temp;

    }

    public int atacarAtaque(double defenzaEnemiga){ // ataca con el ataque y retorna el daño inflingido

        double temp = getStat(2);

        temp = temp - (temp*defenzaEnemiga);
        return (int) temp;

    }

    public double defender(){ // retorna el porsentaje de daño reducido

        double temp = getStat(4);
        temp = (temp/300);
        return temp;
    }

    public void recibirDaño(int daño){ // recibe el daño que fue inflinjido

        cambiarStat(false, 1, daño); //cambia el valor de  vida

        if (getStat(1) <= 0) {

            this.vida = 0;
        }


    }

    public boolean estoyMuerto(){ // indica si el personaje esta muerto

        if (getStat(1) == 0) {
            
            return true;

        } else {
            
            return false;
        }
    }


}