
package zombiedefense.mapa;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Casillas extends JPanel{
    
    private String ruta;
    public int tipo;
    private Image imagen;
   
    public Casillas(int _tipo){
        tipo = _tipo;
        setImagen();
    }
    
    public final void setImagen(){
        switch(tipo){
            case 21:
                ruta = "/images/agua.png";
                break;
            case 1:
                ruta = "/images/aguaH.png";
                break;
            case 2:
                ruta = "/images/aguaUnion.png";
                break;
            case 3:
                ruta = "/images/aguaUnionI.png";
                break;
            case 4:
                ruta = "/images/arbusto1.png";
                break;
            case 5:
                ruta = "/images/arbusto2.png";
                break;
            case 6:
                ruta = "/images/cactus.png";
                break;
            case 7:
                ruta = "/images/casa.png";
                break;
            case 8:
                ruta = "/images/hueco.png";
                break;
            case 9:
                ruta = "/images/huecoN.png";
                break;
            case 10:
                ruta = "/images/lava.png";
                break;
            case 11:
                ruta = "/images/lavaH.png";
                break;
            case 12:
                ruta = "/images/lavaUnion.png";
                break;
            case 13:
                ruta = "/images/lavaUnionI.png";
                break;
            case 14:
                ruta = "/images/muroDoble.png";
                break;
            case 15:
                ruta = "/images/muroUnLado.png";
                break;
            case 16:
                ruta = "/images/pPiedraAgua.png";
                break;
            case 17:
                ruta = "/images/pPiedraLava.png";
                break;
            case 18:
                ruta = "/images/piedra.png";
                break;
            case 19:
                ruta = "/images/piedraH.png";
                break;
            case 20:
                ruta = "/images/roca.png";
                break;
            case 22:
                ruta = "/images/spawning.png";
                break;
            default:
                tipo = 0;
                ruta = "/images/tierra.png";
                break;       
        }
    }
    
    public boolean esCasa(){
        return tipo == 7;
    }
    
    public boolean esObstaculo(){
        return tipo < 16 || tipo == 21 && tipo != 7;
    }
    
    public int getTipo(){
        return this.tipo;
    }
    
    public boolean esSpawning(){
        return tipo == 22;
    }
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);          
        super.paint(g);
        
    }
        
}
