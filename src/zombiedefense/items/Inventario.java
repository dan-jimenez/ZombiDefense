package items;

public class Inventario {


    public int[] cantidad; // cantidad de items de la misma categoría
    public String[] objetos;
    public int items_totales; // total de objetos que puede tener 
    public String usuario;




    public Inventario(int pertenece){ // la entrada del constructor determina si es el inventario de la tienda o del personaje
        //si pertenece = 0 ||tienda; si pertenece = 1 ||personaje
    


        if (pertenece == 0) {

            this.usuario = "Tienda";
            this.items_totales = 30;
            this.cantidad = new int[this.items_totales];
        } 
        else {


            this.usuario = "Personaje";
            this.items_totales = 10;
            this.cantidad = new int[this.items_totales];
        }

    }

    public void inventario_CambioCantidad(boolean tipo, int referencia, int cantidad) { //se compra con tipo = true y se vende con tipo = false
     // referencia es el numero asignado de item espadas de 0-4, armaduras de 5-9, y consumibles de 10-14 por ejemplo
        if (tipo) {
            this.cantidad[referencia] += cantidad;
        } else {
            this.cantidad[referencia] -= cantidad;
        }
    }

    public int inventario_Comprar(int dinero, int costo, int referencia) { //

        if (dinero < costo){
            return -1;
        }
        dinero -= costo;
        inventario_CambiarCantidad_1(true, referencia); //aumenta la cantidad
        return 1;
    }

    public int inventario_Vender(int dinero, int costo, int referencia) { // 

        if (cantidad[referencia] <= 0){
            return -1;
        }
        dinero += (costo / 2);
        inventario_CambiarCantidad_1(false, referencia); // disminuye la cantidad
        return 1;
    }

    public void inventario_CambiarCantidad_1(boolean tipo, int referencia) { // cambia el valor contenido en cantidad[referencia]

        if (referencia < this.items_totales) {

            if (tipo) {
                this.cantidad[referencia] += 1;
            }
            else{
                this.cantidad[referencia] -= 1;
            }
        }
        else {

            System.out.println("\nError, fuera de indice referencia?\n");
        }
    }

    //public void ToInventary(boolean tipo, int reference){

    //}







}
