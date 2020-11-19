package zombieDefense;

public class Inventario {

	public int[] cantidad;
	public String[] armas;
	public String[] armaduras;
	public String[] consumibles;
	public int items_totales = 0;
	public String usuario;

	public Inventario(int pertenece) {

		/**@constructorInventario Constructor publico del inventario Recibe: - Un entero
		 * que se usa como referencia para saber si quien ser� el usuario [Si pertenece
		 * = 0 entonces el inventario pertenece a la Tienda, Si pertenece = 1 entonces
		 * el inventario pertenece al personaje]
		 * 
		 * Retorna: Nada
		 */

		this.armas = new String[5];
		this.armaduras = new String[5];
		this.consumibles = new String[5];

		if (pertenece == 0) {
			this.usuario = "Tienda";
		} else {
			this.usuario = "Personaje";
		}

	}

	public void inventarioCambioCantidad(boolean tipo, int referencia, int cantidad) {

		/*
		 * @inventarioCambioCantidad Recibe: - Un booleano que describe el tipo si es
		 * compra o venta (True = compra y False = venta) - Un entero que referencia si
		 * es armadura, armas o consumible (0-4 son armas, 5-9 son armaduras, 10-14 son
		 * consumibles) - Un entero que determina cantidad de items que se van a agregar
		 * 
		 * Retorna: Nada
		 */
		if (tipo) {
			this.cantidad[referencia] += cantidad;
		} else {
			this.cantidad[referencia] -= cantidad;
		}
	}

	public void inventarioComprar(int dinero, int costo, int referencia) { // faltan validaciones de suficiente dinero

		dinero -= costo;
		inventario_CambiarCantidad_1(true, referencia);

	}

	public void inventario_Vender(int dinero, int costo, int referencia) { // faltan validaciones de cantidad de items

		dinero += (costo / 2);
		inventario_CambiarCantidad_1(false, referencia);

	}

	public void inventario_CambiarCantidad_1(boolean tipo, int referencia) { // cambia el valor[referencia] de cantidad
																				// del identificacion del objeto

		if (referencia < this.items_totales) {

			if (tipo) {
				this.cantidad[referencia] += 1;
			} else {
				this.cantidad[referencia] -= 1;
			}
		} else {

			System.out.println("Error, fuera de indice referencia");
		}
	}

	public void ToInventary(boolean tipo, int reference) {

	}

}
