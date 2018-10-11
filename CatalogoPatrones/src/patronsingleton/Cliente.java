/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

/**
 *
 * @author Daniel
 */
import javax.swing.JOptionPane;

public class Cliente {
    
    public static void main(String[] args) {
        Bicicleta obj_Bicicleta1 = Bicicleta.getInstance();
        Bicicleta obj_Bicicleta2 = Bicicleta.getInstance();
        
        obj_Bicicleta1.setTipoBicicleta("Todo Terreno");
        JOptionPane.showMessageDialog(null, obj_Bicicleta2.getTipoBicicleta());
        obj_Bicicleta2.setTipoBicicleta("Piñon Fijo");
        JOptionPane.showMessageDialog(null, obj_Bicicleta1.getTipoBicicleta());
        
    }
}
