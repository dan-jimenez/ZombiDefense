package zombiedefense.mapa;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapaPrueba extends JFrame {
    
    
    private static final Mapa mapa = new Mapa(0, 12, 8);
    private static JPanel panel1 = new JPanel();
    private static JPanel panel2 = new JPanel();
    private static JPanel panel3 = new JPanel();
    private static JPanel panel4 = new JPanel();
    private static JPanel panel5 = new JPanel();
    
    
    public static void main(String[] args){
        MapaPrueba mapaS = new MapaPrueba();
        mapaS.setVisible(true);
        
        
        
    }
    public MapaPrueba(){
        initComponents();
        
    }

    private void initComponents() {
        setSize(new Dimension(1080,720));
        /*
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setBackground(new Color(0,12,0));
        panel3.setBackground(new Color(123,12,0));
        panel4.setBackground(new Color(12,12,34));
        panel5.setBackground(new Color(123,45,98));
        
        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);
        panel1.add(panel5);
        
        add(panel1);*/
        
        add(mapa);
        
        
    }
}
