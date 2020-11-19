package zombiedefense.personaje;

import javax.swing.ImageIcon;


public class Habilidades {
    
    private final String nombre;
    private final int id;
    private boolean estado;
    private ImageIcon imagen;
    
    
    public Habilidades(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        estado = false;
    }
    
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean getEstado(){
        return estado;
    }
    
    public void cambiarEstado(){
        estado = !estado;
    }
}
