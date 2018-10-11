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
public abstract class Perilla {
    
    String peso;
    
    public Perilla(String peso){
        this.peso=peso;
    }
    
    public abstract Perilla duplicar();

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
}
