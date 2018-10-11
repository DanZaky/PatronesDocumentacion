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
public class PuertaDuplicable extends Puerta{

    public PuertaDuplicable(Ventana ventana, Perilla perilla) {
        super(ventana, perilla);
    }

    @Override
    public Puerta duplicar() {
        return new PuertaDuplicable(this.ventana, this.perilla);
    }
    
    
    
}
