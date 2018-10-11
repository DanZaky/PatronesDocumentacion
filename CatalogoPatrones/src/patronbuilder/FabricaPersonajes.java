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
public class FabricaPersonajes {
    
    private PersonajeBuilder personajeFabricado;
    
    public void construirPersonajeAbstracto(){
        
        personajeFabricado.crearPersonajeConcreto();
        personajeFabricado.buildMontura();
        personajeFabricado.buildArma();
        personajeFabricado.buildHabilidad();
        personajeFabricado.buildRaza();
    }

    public void setPersonajeBuilder(PersonajeBuilder personajeFabricado) {
        this.personajeFabricado = personajeFabricado;
    }
    
    public Personaje getPersonaje() {
        return personajeFabricado.getPersonaje();
    }

    
 
    
}
