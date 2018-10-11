package patronproxy;

import javax.swing.JOptionPane;

public class PatronProxy {

    public static void main(String[] args) {
        int cod_llave,cod_seguridad;
        cod_llave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la llave: "));
        cod_seguridad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de seguridad: "));
        
        Candado candado = new Candado(cod_llave, cod_seguridad);
        
        Llave llave1 = new LlaveReal(cod_llave);
        llave1.Contacto(candado);
        
        Llave llave2 = new LlaveProxy(llave1);
        llave2.Contacto(candado);
    }
}
