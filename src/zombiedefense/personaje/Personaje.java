package zombiedefense.personaje;


import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import zombiedefense.items.Item;

public class Personaje extends JLabel {
    
    public static final Habilidades[] hGenerales = {new Habilidades(1, "Saltar obstaculos"),
            new Habilidades(2, "Doble experiencia"),new Habilidades(3, "Doble Vida"),
            new Habilidades(4, "Doble Ataque lejano"),new Habilidades(5, "Mayor campo de vision"),
            new Habilidades(6, "Doble Ataque cercano"),new Habilidades(7, "immortalidad"),
            new Habilidades(8, "Mayor alcance maximo"),new Habilidades(9, "Cerrar Spowning"),
            new Habilidades(10, "Regeneracion"), new Habilidades(11, "Sin ruido")};
    private final int id;
    private int vida = 100;
    private Item[] equipo = new Item[5];
    private int ataque;
    private String nombre;
    private ImageIcon imagen;
    private static Habilidades[] habilidades = new Habilidades[3];
    
    
    
    
    public Personaje(int identificador){
        this.id = identificador;
        setPersonaje();
        initComponents();
    }
    
    private void initComponents(){
        setPreferredSize(new Dimension(80, 80));
        setIcon(imagen);
        
    }   
    
    private void setPersonaje() {
        switch (id){
            case 1:
                ataque = 30;
                nombre = "Esqueleto";
                imagen = new ImageIcon(getClass().getResource("/images/esqueleto.png"));
                habilidades[0] = hGenerales[1];
                habilidades[1] = hGenerales[5];
                habilidades[2] = hGenerales[6];
                break;
            case 2:
                ataque = 20;
                nombre = "Arquero";
                imagen = new ImageIcon(getClass().getResource("/images/arquero.png"));
                habilidades[0] = hGenerales[2];
                habilidades[1] = hGenerales[3];
                habilidades[2] = hGenerales[7];
                break;
            case 3:
                ataque = 30;
                nombre = "Caballero";
                imagen = new ImageIcon(getClass().getResource("/images/caballero.png"));
                habilidades[0] = hGenerales[0];
                habilidades[1] = hGenerales[2];
                habilidades[2] = hGenerales[5];
                break;
            case 4:
                ataque = 40;
                nombre = "Astro";
                imagen = new ImageIcon(getClass().getResource("/images/astro.png"));
                habilidades[0] = hGenerales[1];
                habilidades[1] = hGenerales[2];
                habilidades[2] = hGenerales[5];
                break;
            case 5:
                ataque = 20;
                nombre = "Ninja";
                imagen = new ImageIcon(getClass().getResource("/images/ninja.png"));
                habilidades[0] = hGenerales[0];
                habilidades[1] = hGenerales[1];
                habilidades[2] = hGenerales[10];
                break;
            default:
                ataque = 30;
                nombre = "Vampiro";
                imagen = new ImageIcon(getClass().getResource("/images/vampiro.png"));
                habilidades[0] = hGenerales[0];
                habilidades[1] = hGenerales[8];
                habilidades[2] = hGenerales[9];
                break;
        }
    }
}
