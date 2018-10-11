package patronfachada;

import javax.swing.JOptionPane;

public class Fachada {
    public void Reparar(String estado){
        Taller taller = new Taller(estado);
        JOptionPane.showMessageDialog(null, "Su bicicleta será llevada a reparar");
        taller.consulta();
    }
}
