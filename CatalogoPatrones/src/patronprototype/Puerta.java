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
public abstract class Puerta {
    
    Ventana ventana;
    Perilla perilla;
    
    public Puerta(Ventana ventana, Perilla perilla){
        
        this.ventana = ventana;
        this.perilla = perilla;
        
    }
    
    public abstract Puerta duplicar();

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Perilla getPerilla() {
        return perilla;
    }

    public void setPerilla(Perilla perilla) {
        this.perilla = perilla;
    }
    
    
    
}
