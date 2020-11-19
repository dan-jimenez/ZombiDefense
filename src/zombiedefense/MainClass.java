package zombiedefense;

/**
 *
 * @author estadm
 */
public class MainClass {
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    public static VentanaJuego juego = new VentanaJuego(1);
    
    public static void main(String[] args){ 
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
