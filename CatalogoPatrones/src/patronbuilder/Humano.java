/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

/**
 *
 * @author Daniel
 */
public class Humano extends PersonajeBuilder{
    
    @Override
    public void buildMontura() {
        
        Montura montura = new Montura();
        montura.setTipo_montura("Caballo");
        personaje.setMontura(montura);
        
    }

    @Override
    public void buildArma() {
        
        Arma arma = new Arma();
        arma.setTipo_arma("Espada");
        personaje.setArma(arma);
        
    }

    @Override
    public void buildHabilidad() {
        
        Habilidad habilidad = new Habilidad();
        habilidad.setTipo_habilidad("Diplomacia");
        personaje.setHabilidad(habilidad);
        
    }
    
    @Override
    public void buildRaza() {

        personaje.setRaza("Humano");
        
    }
    
}
