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
public abstract class Ventana {
    
    String altura;
    
    public Ventana(String altura){
        this.altura=altura;
    }
    
    public abstract Ventana duplicar();

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    
    
}
