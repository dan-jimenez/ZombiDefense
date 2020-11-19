package zombiedefense;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.UIManager;
import zombiedefense.mapa.Mapa;
import zombiedefense.mapa.PanelControl;
import zombiedefense.personaje.Personaje;

public class Juego extends JFrame implements Runnable {

    private Thread threadIniciar;
    public static volatile boolean enFuncionamiento = false;
    public static final String NOMBRE = "Zombie Defense";
    private static int tiempo = 0;
    public static int segundos = 0;
    public static int minutos = 0;
    private static int mapaSeleccionado;
    private final Personaje[] personajes;
    private static final int largo = 12;
    private static final int ancho = 8;
    private static Mapa mapa;
    private static PanelControl controles;
    
    /**
     *
     * @param seleccionMapa
     * 
     */
    public Juego(int seleccionMapa, int p1, int p2, int p3){
        try {
            setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        personajes = new Personaje[3];
        this.personajes[0] = new Personaje(p1);
        this.personajes[1] = new Personaje(p2);
        this.personajes[2] = new Personaje(p3);
        mapaSeleccionado = seleccionMapa;
        initComponents();
    }
    
    private void initComponents(){
        
        setExtendedState(Juego.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setLayout(new BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        mapa = new Mapa(mapaSeleccionado, largo, ancho);
        controles = new PanelControl();
        add(controles);
        add(mapa);
        
    }
     
    public synchronized void iniciar(){
        enFuncionamiento = true;
        
        threadIniciar = new Thread(this, "Partida Nueva");
        threadIniciar.start();
        
        
    }
    public synchronized void detener(){
        enFuncionamiento = false;
        tiempo = 0;
        minutos = 0;
        segundos = 0;
        try {
            threadIniciar.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public synchronized void pausa(){
        enFuncionamiento = false;
        try{
            threadIniciar.wait();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    public void actualizar(){
        tiempo++;
    }
    
    public void mostrar(){
        if (segundos <= 5){
            mapa.hacerSpawning(47);
            mapa.crearCasillas();
            mapa.implementarMapa();
        }
        
    }    

    @Override
    public void run() {
        setVisible(true);
        final int NS_POR_SEGUNDO = 1000000000;
        final byte APS_SEGUNDO = 60;
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_SEGUNDO;
        
        long referenciaActualizacion = System.nanoTime();
        
        double tiempoTranscurrido;
        double delta = 0;
        
        while(enFuncionamiento){
            final long inicioBucle = System.nanoTime();
            
            tiempoTranscurrido = inicioBucle - referenciaActualizacion;
            referenciaActualizacion = inicioBucle;
            delta += tiempoTranscurrido/NS_POR_ACTUALIZACION;
            
            while(delta >= 1) {
                actualizar();
                delta--;
            }
            segundos = tiempo/ 60;
            if (Juego.segundos == 60){
                Juego.minutos++;
                controles.titulo.setText(Juego.NOMBRE + " || Tiempo: " + Juego.minutos + ":" + Juego.segundos);
            }
            else{
                controles.titulo.setText(Juego.NOMBRE + " || Tiempo: " + Juego.minutos + ":" + Juego.segundos);
            }
            
            
            //mostrar();
    }
    
    
}
}
