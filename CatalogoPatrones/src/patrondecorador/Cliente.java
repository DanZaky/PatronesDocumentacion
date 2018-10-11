package patrondecorador;

import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {

        Alquilar bici = new BicicletaCross();
        bici = new Amortiguadores(bici);

        JOptionPane.showMessageDialog(null, "El costo del alquiler de la bicicleta es de: " + bici.getPrecio());
        JOptionPane.showMessageDialog(null, "Sus caracteristicas son: " + bici.getDescripcion());

        Alquilar bici1 = new BicicletaCross();
        bici1 = new Amortiguadores(bici1);
        bici1 = new Cambios(bici1);
        bici1 = new Velocimetro(bici1);

        JOptionPane.showMessageDialog(null, "El costo del alquiler de la bicicleta es de: " + bici1.getPrecio());
        JOptionPane.showMessageDialog(null, "Sus caracteristicas son: " + bici1.getDescripcion());
    }
}
