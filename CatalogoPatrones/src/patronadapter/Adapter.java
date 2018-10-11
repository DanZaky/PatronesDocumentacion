package patronadapter;

import javax.swing.JOptionPane;

public class Adapter {

    public static void main(String[] args) {
        Cambio adaptador = new Adaptador();
        float ration;
        ration = adaptador.cambioRatio();
        JOptionPane.showMessageDialog(null, "Radio en pulgadas: "+adaptador.ratio
                + "\nEl radio en cm es: "+ration);
    }
    
}
