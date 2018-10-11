package patronadapter;

import javax.swing.JOptionPane;

public class Adaptable {
    int radioV;
    
    public int captura(){
        radioV = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio en pulgadas que desea: "));
        return radioV;
    }
}
