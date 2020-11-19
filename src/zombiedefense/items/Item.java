package zombiedefense.items;

public class Item {
    
private String nombre;
private int maxvida; // numero de referencia 0
private int vida; // numero de referencia 1
private int ataque; // numero de referencia 2
private int magia; // numero de referencia 3
private int defensa; // numero de referencia 4
private int suerte; // numero de referencia 5
private int costo; // numero de referencia 6
private int ruido; // numero de referencia 7
private int alcance; // numero de referencia 8
private int[] todos = {this.maxvida, this.vida, this.ataque, this.magia, this.defensa, this.suerte, this.ruido, this.alcance};


    public Item(){ //inicializa todos los Stats del item en 0

        this.maxvida = 0;
        this.vida = 0;
        this.ataque = 0;
        this.magia = 0;
        this.defensa = 0;
        this.suerte = 0;
        this.costo = 0;
        this.ruido = 0;
        this.alcance = 0;
        this.nombre = "null";

    }

    public Item(int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo,int ruido, int alcance, String nombre){ //inicializa los stats en un valore otorgado

        this.maxvida = maxvida;
        this.vida = vida;
        this.ataque = ataque;
        this.magia = magia;
        this.defensa = defensa;
        this.suerte = suerte;
        this.costo = costo;
        this.ruido = ruido;
        this.alcance = alcance;
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

            case 7: //suerte
            return this.ruido;
           
            case 8: //dinero
            return this.alcance;
    
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

    
    public void setItem_Stats (int maxvida, int vida, int ataque, int magia, int defensa, int suerte, int costo, int ruido, int alcance){ // asigna valores a todos los stats del item

    this.maxvida = maxvida;
    this.vida = vida;
    this.ataque = ataque;
    this.magia = magia;
    this.defensa = defensa;
    this.suerte = suerte;
    this.costo = costo;
    this.ruido = ruido;
    this.alcance = alcance;

    }

    public void setItem_Stat(int referencia, int valor){

        switch (referencia) {
            case 0: //maxvida
            this.maxvida = valor;
            
            case 1: //vida
            this.vida = valor;
            
            case 2: //ataque
            this.ataque = valor;
            
            case 3: //magia
            this.magia = valor;
           
            case 4: //defensa
            this.defensa = valor;
            
            case 5: //suerte
            this.suerte = valor;
           
            case 6: //dinero
            this.costo = valor;

            case 7: //suerte
            this.ruido = valor;
           
            case 8: //dinero
            this.alcance = valor;
    
            default: //nada
        }
    }

    public void setItem_Name(String nombre){ // asigna un nombre al objeto
        
        this.nombre = nombre;
    }


}
