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
public class PerillaDuplicable extends Perilla{

    public PerillaDuplicable(String peso) {
        super(peso);
    }

    @Override
    public Perilla duplicar() {
        return new PerillaDuplicable(this.peso);
    }
    
}
