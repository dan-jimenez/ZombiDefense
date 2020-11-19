package zombieDefense;

public class Items {
    
private String nombre;
private int ruido; // ruido que se genera
private int alcance; // alcanze de ataque 
private int maxvida; // numero de referencia 0
private int vida; // numero de referencia 1
private int ataque; // numero de referencia 2
private int magia; // numero de referencia 3
private int defensa; // numero de referencia 4
private int suerte; // numero de referencia 5
private int costo; // numero de referencia 6
private int[] todos = {this.maxvida, this.vida, this.ataque, this.magia, this.defensa, this.suerte};


    public Items(){ //inicializa todos los Stats del item en 0

        this.maxvida = 0;
        this.vida = 0;
        this.ataque = 0;
        this.magia = 0;
        this.defensa = 0;
        this.suerte = 0;
        this.costo = 0;
        this.nombre = "null";

    }

    public Items(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, String nombre){ //inicializa los stats en un valore otorgado

        this.maxvida = maxvida;
        this.vida = vida;
        this.ataque = ataque;
        this.magia = magia;
        this.defensa = defensa;
        this.suerte = suerte;
        this.costo = costo;
        this.nombre = nombre;
    }


    public int getItem_Stat(int stat){ // se píde con el numero de referencia

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
           
            case 6: //dinero
            return this.costo;
    
            default: //nada
    
                return 0;
        }
    }
    public int[] getItem_Stats(){ //devuelde todos los stats del objeto excepto dinero y nombre

        return this.todos;
    }
    public String getItem_Nombre() { // devuelve el nombre del item
        
        return this.nombre;
    }

    
    public void setItem_Stats (int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo){ // asigna valores a todos los stats del item

    this.maxvida = maxvida;
    this.vida = vida;
    this.ataque = ataque;
    this.magia = magia;
    this.defensa = defensa;
    this.suerte = suerte;
    this.costo = costo;

    }

    public void setItem_Name(String nombre){ // asigna un nombre al objeto
        
        this.nombre = nombre;
    }


}
