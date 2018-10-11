/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronprototype;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ventana vn1 = new VentanaDuplicable("1.90");
        Perilla per1 = new PerillaDuplicable("10gm");
        
        Ventana vn2 = new VentanaDuplicable("1.99");
        Perilla per2 = new PerillaDuplicable("19gm");
        
        Ventana vn3 = new VentanaDuplicable("2.00");
        Perilla per3 = new PerillaDuplicable("20gm");
        
        Puerta puerta1 = new PuertaDuplicable(vn1, per1);
        Puerta puerta2 = new PuertaDuplicable(vn2, per2);
        
        Puerta puertaduplicada1;
        Puerta puertaduplicada2;
        Puerta puertaduplicada3;
        
        puertaduplicada1 = puerta1.duplicar();
        puertaduplicada1.setVentana(vn3);
        puertaduplicada2 = puerta2.duplicar();
        puertaduplicada3 = puerta1.duplicar();
        
        JOptionPane.showMessageDialog(null,"La puerta duplicada1 tiene ventana con altura: "+puertaduplicada1.getVentana().getAltura()+" y perilla con peso: "+puertaduplicada1.getPerilla().getPeso());
        JOptionPane.showMessageDialog(null,"La puerta duplicada2 tiene ventana con altura: "+puertaduplicada2.getVentana().getAltura()+" y perilla con peso: "+puertaduplicada2.getPerilla().getPeso());
        JOptionPane.showMessageDialog(null,"La puerta duplicada3 tiene ventana con altura: "+puertaduplicada3.getVentana().getAltura()+" y perilla con peso: "+puertaduplicada3.getPerilla().getPeso());
    }
    
}
