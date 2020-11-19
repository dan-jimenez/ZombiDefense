package zombiedefense.per;

public class Abominacion extends Personaje{


    //los stats y nombre de items se guardan en la clase padre Items

    public Abominacion (int maxvida, int vida, int ataque, int magia, int defensa,
    int suerte, int ruido, int alcance, int dinero, int cor_x, int cor_y, int nivel, int movimiento){

        super (maxvida, vida, ataque, magia, defensa,
        suerte, ruido, alcance, dinero, cor_x, cor_y, nivel, movimiento);
    }


    // las habilidades se activan
    public void habilidad1(){ 

        if (getHabilidades(0) != 1) { // osea, la habilidad no esta activa
            
            return;

        } else { // la habilidad esta activa
            
            /*duplica la vida y vida maxima */

            cambiarStat(true, 0, getStat(0)); // duplica la vida maxima
            cambiarStat(true, 1, getStat(1)); // duplica la vida

        }
    }

    public void habilidad2(){ 

        if (getHabilidades(1) != 1) { // osea, la habilidad no esta activa
            
            return;

        } else { // la habilidad esta activa
            

            //implementar habilidad


        }

    }

    public void habilidad3(){ 

        if (getHabilidades(2) != 1) { // osea, la habilidad no esta activa
            
            return;

        } else { // la habilidad esta activa
            

            //implementar habilidad


        }

    }

    //
    





}

