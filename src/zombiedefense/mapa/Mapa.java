
package zombiedefense.mapa;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public final class Mapa extends JPanel {
    private final int identificador;
    private Image imagen;
    private String ruta;
    private static int totalCasillas;
    public final Casillas[] casillasTodas;
    private final int ancho;
    private final int largo;

    
    
   
    public Mapa(int id, int largo, int ancho){
      identificador = id;
      this.largo = largo;
      this.ancho = ancho;
      totalCasillas = largo * ancho ;
      casillasTodas = new Casillas[totalCasillas];
      initComponents();
    }
   
    @SuppressWarnings("empty-statement")
   public void crearCasillas(){
       switch(identificador){
               case 1:
                   ruta = "/images/fondo3.png";
                   for (int i = 0; i < totalCasillas; i++){
                       switch (i){
                           case 5:
                               casillasTodas[i] = new Casillas(17);
                               break;
                           case 15:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 11:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 17:
                               casillasTodas[i] = new Casillas(17);
                               break;
                           case 23:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 29:
                               casillasTodas[i] = new Casillas(17);
                               break;
                           case 31:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 35:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 38:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 39:
                               casillasTodas[i] = new Casillas(12);
                               break;
                           case 40:
                               casillasTodas[i] = new Casillas(11);
                               break;
                           case 41:
                               casillasTodas[i] = new Casillas(13);
                               break;
                           case 43:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 51:
                               casillasTodas[i] = new Casillas(10);
                               break;
                           case 58:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 60:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 61:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 63:
                               casillasTodas[i] = new Casillas(17);
                               break;
                           case 66:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 68:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 75:
                               casillasTodas[i] = new Casillas(10);
                               break;
                           case 77:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 84:
                               casillasTodas[i] = new Casillas(7);
                               break;
                           case 87:
                               casillasTodas[i] = new Casillas(17);
                               break;
                           case 91:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 94:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           default:
                               casillasTodas[i] = new Casillas(0);
                               break;
                       }
                      }
                   break;
               case 2:
                   ruta = "/images/fondo2.jpg";
                   for (int i = 0; i < totalCasillas; i++){
                       switch (i){
                           case 0:
                               casillasTodas[i] = new Casillas(7);
                               break;
                           case 11:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 15:
                               casillasTodas[i] = new Casillas(14);
                               break;
                           case 19:
                               casillasTodas[i] = new Casillas(15);
                               break;
                           case 21:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 23:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 27:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 30:
                               casillasTodas[i] = new Casillas(14);
                               break;
                           case 31:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 33:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 34:
                               casillasTodas[i] = new Casillas(9);
                               break;
                           case 35:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 36:
                               casillasTodas[i] = new Casillas(9);
                               break;
                           case 39:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 43:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 46:
                               casillasTodas[i] = new Casillas(15);
                               break;
                           case 50:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 51:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 56:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 60:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 63:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 70:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 73:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 75:
                               casillasTodas[i] = new Casillas(6);
                               break;
                           case 79:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 82:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 89:
                               casillasTodas[i] = new Casillas(9);
                               break;
                           case 90:
                               casillasTodas[i] = new Casillas(9);
                               break;
                           case 94:
                               casillasTodas[i] = new Casillas(9);
                               break;
                           default:
                               casillasTodas[i] = new Casillas(0);
                               break;
                       }
                   }
                   break;
               default:
                   ruta = "/images/fondo.jpg";
                   for (int i = 0; i < totalCasillas; i++){
                       switch (i){
                           case 6:
                               casillasTodas[i] = new Casillas(16);
                               break;
                           case 8:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 11:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 18:
                               casillasTodas[i] = new Casillas(16);
                               break;
                           case 20:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 23:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 26:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 27:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 29:
                               casillasTodas[i] = new Casillas(4);
                               break;
                           case 30:
                               casillasTodas[i] = new Casillas(16);
                               break;
                           case 35:
                               casillasTodas[i] = new Casillas(22);
                               break;
                           case 39:
                               casillasTodas[i] = new Casillas(8);
                               break;
                           case 40:
                               casillasTodas[i] = new Casillas(2);
                               break;
                           case 41:
                               casillasTodas[i] = new Casillas(1);
                               break;
                           case 42:
                               casillasTodas[i] = new Casillas(3);
                               break;
                           case 52:
                               casillasTodas[i] = new Casillas(21);
                               break;
                           case 53:
                               casillasTodas[i] = new Casillas(4);
                               break;
                           case 57:
                               casillasTodas[i] = new Casillas(8);
                               break;
                           case 58:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 60:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 62:
                               casillasTodas[i] = new Casillas(2);
                               break;
                           case 63:
                               casillasTodas[i] = new Casillas(1);
                               break;
                           case 64:
                               casillasTodas[i] = new Casillas(3);
                               break;
                           case 68:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 72:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 74:
                               casillasTodas[i] = new Casillas(21);
                               break;
                           case 75:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 79:
                               casillasTodas[i] = new Casillas(8);
                               break;
                           case 80:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 81:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 82:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 84:
                               casillasTodas[i] = new Casillas(7);
                               break;
                           case 86:
                               casillasTodas[i] = new Casillas(21);
                               break;
                           case 89:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           case 93:
                               casillasTodas[i] = new Casillas(8);
                               break;
                           case 94:
                               casillasTodas[i] = new Casillas(20);
                               break;
                           default:
                               casillasTodas[i] = new Casillas(0);
                               break;
                       }
                      }
                   break;
       }
       
       
   }
   public void implementarMapa(){
        setSize(new Dimension(largo * 90, ancho * 90));
        setLayout(new GridLayout(ancho, largo));
        for(int i = 0; i < totalCasillas; i++){
             casillasTodas[i].setPreferredSize(new Dimension(90, 90));
             add(casillasTodas[i]);
        }
   }
   
   public final void initComponents(){
       crearCasillas();
       implementarMapa();
   }
   
    public void hacerSpawning(int identificador){
        Casillas spawning = new Casillas(22);
        casillasTodas[identificador] = spawning; 
    }
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
}