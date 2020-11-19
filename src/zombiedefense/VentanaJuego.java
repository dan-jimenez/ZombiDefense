package zombiedefense;

import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.UIManager;
import static zombiedefense.MainClass.juego;
import static zombiedefense.MainClass.ventana;
import zombiedefense.mapa.Mapa;

public class VentanaJuego extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form VentanaJuego
     */
    private Thread threadIniciar;
    private static volatile boolean enFuncionamiento = false;
    private static final String NOMBRE = "Zombie Defense";
    private static int tiempo = 0;
    private static int segundos = 0;
    private static int minutos = 0;
    private static int mapaSeleccionado;
    private static  final int largo = 12;
    private static final int ancho = 8;
    private static Mapa mapa;
    
    
    public VentanaJuego(int mapaSeleccionado) {
        try {
            setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        VentanaJuego.mapaSeleccionado = mapaSeleccionado;
        mapa = new Mapa(VentanaJuego.mapaSeleccionado, largo, ancho);
        initComponents();
        getContentPane().add(mapa);
    }
    
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelControl = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnSalirMenu = new javax.swing.JButton();
        btnSalirJuego = new javax.swing.JButton();
        btnPausa = new javax.swing.JToggleButton();
        informacionPersonajes = new javax.swing.JTabbedPane();
        personaje1 = new javax.swing.JPanel();
        iconoP1 = new javax.swing.JLabel();
        personaje2 = new javax.swing.JPanel();
        iconoP2 = new javax.swing.JLabel();
        personaje3 = new javax.swing.JPanel();
        iconoP3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zombie Defense");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setName("VentanaJuego"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelControl.setBackground(new java.awt.Color(0, 51, 0));
        panelControl.setPreferredSize(new java.awt.Dimension(245, 660));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("--------------");

        btnSalirMenu.setBackground(new java.awt.Color(0, 30, 0));
        btnSalirMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirMenu.setText("Salir al Menu");
        btnSalirMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMenuActionPerformed(evt);
            }
        });

        btnSalirJuego.setBackground(new java.awt.Color(0, 30, 0));
        btnSalirJuego.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalirJuego.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirJuego.setText("Salir del Juego");
        btnSalirJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirJuegoActionPerformed(evt);
            }
        });

        btnPausa.setBackground(new java.awt.Color(0, 30, 0));
        btnPausa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPausa.setForeground(new java.awt.Color(255, 255, 255));
        btnPausa.setText("Pausa");
        btnPausa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausaActionPerformed(evt);
            }
        });

        iconoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arbusto2.png"))); // NOI18N
        iconoP1.setText("icono");
        iconoP1.setPreferredSize(new java.awt.Dimension(110, 110));

        javax.swing.GroupLayout personaje1Layout = new javax.swing.GroupLayout(personaje1);
        personaje1.setLayout(personaje1Layout);
        personaje1Layout.setHorizontalGroup(
            personaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        personaje1Layout.setVerticalGroup(
            personaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        informacionPersonajes.addTab("tab1", personaje1);

        iconoP2.setText("icono");
        iconoP2.setPreferredSize(new java.awt.Dimension(110, 110));

        javax.swing.GroupLayout personaje2Layout = new javax.swing.GroupLayout(personaje2);
        personaje2.setLayout(personaje2Layout);
        personaje2Layout.setHorizontalGroup(
            personaje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        personaje2Layout.setVerticalGroup(
            personaje2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        informacionPersonajes.addTab("tab2", personaje2);

        iconoP3.setText("icono");
        iconoP3.setPreferredSize(new java.awt.Dimension(110, 110));

        javax.swing.GroupLayout personaje3Layout = new javax.swing.GroupLayout(personaje3);
        personaje3.setLayout(personaje3Layout);
        personaje3Layout.setHorizontalGroup(
            personaje3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        personaje3Layout.setVerticalGroup(
            personaje3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personaje3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        informacionPersonajes.addTab("tab3", personaje3);

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo))
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalirJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(informacionPersonajes)))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(27, 27, 27)
                .addComponent(informacionPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(btnPausa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalirMenu)
                .addContainerGap())
        );

        getContentPane().add(panelControl);

        pack();
    }// </editor-fold>//GEN-END:initComponents
                      

    
    private void btnSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMenuActionPerformed
        ventana.setVisible(true);
        detener();
        setVisible(false);
    }//GEN-LAST:event_btnSalirMenuActionPerformed
    private void btnSalirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirJuegoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirJuegoActionPerformed

    private void btnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausaActionPerformed
        if (enFuncionamiento){
            juego.detener();
            titulo.setText(NOMBRE + " || PAUSA "+  " || Tiempo: " + minutos + ":" + segundos);
            btnPausa.setBackground(new java.awt.Color(0, 30, 0));
            btnPausa.setText("Resumen");
        }
        else{
            juego.iniciar();
            btnPausa.setText("Pausa");
            btnPausa.setBackground(new java.awt.Color(0, 30, 0));
        }
    }//GEN-LAST:event_btnPausaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPausa;
    private javax.swing.JButton btnSalirJuego;
    private javax.swing.JButton btnSalirMenu;
    private javax.swing.JLabel iconoP1;
    private javax.swing.JLabel iconoP2;
    private javax.swing.JLabel iconoP3;
    private javax.swing.JTabbedPane informacionPersonajes;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel personaje1;
    private javax.swing.JPanel personaje2;
    private javax.swing.JPanel personaje3;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public synchronized void iniciar(){
        enFuncionamiento = true;
        
        threadIniciar = new Thread(this, "Partida Nueva");
        threadIniciar.start();
        
        
    }
    public synchronized void detener(){
        enFuncionamiento = false;
        try {
            threadIniciar.join();
        }catch(InterruptedException e){
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
        setExtendedState(VentanaJuego.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        final int NS_POR_SEGUNDO = 1000000000;
        final byte APS_SEGUNDO = 60;
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_SEGUNDO;
        
        long referenciaActualizacion = System.nanoTime();
        long referenciaContador =  System.nanoTime();
        
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
            if (segundos == 60){
                minutos++;
                titulo.setText(NOMBRE + " || Tiempo: " + minutos + ":" + segundos);
            }
            else{
                titulo.setText(NOMBRE + " || Tiempo: " + minutos + ":" + segundos);
            }
            
            //mostrar();
            
            
        }
    }
}