/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronprototype;

/**
 *
 * @author Daniel
 */
public class VentanaDuplicable extends Ventana{

    public VentanaDuplicable(String altura) {
        super(altura);
    }

    @Override
    public Ventana duplicar() {
        return new VentanaDuplicable(this.altura);
    }
    
}
