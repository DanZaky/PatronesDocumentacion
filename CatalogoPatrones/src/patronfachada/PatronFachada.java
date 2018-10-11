package patronfachada;

import javax.swing.JOptionPane;

public class PatronFachada {

    public static void main(String[] args) {
        String estado = JOptionPane.showInputDialog("¿Qué necesita reparar, las llantas o la cadena?");
        Fachada local_taller = new Fachada();
        local_taller.Reparar(estado);
    }
}
