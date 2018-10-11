/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbuilder;

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
        
        FabricaPersonajes fabrica = new FabricaPersonajes();
        String op = JOptionPane.showInputDialog("Ingrese el tipo de personaje que desee\n(Orco, Humano, Elfo, Enano)");
        
        if(op.equals("Orco")){
            fabrica.setPersonajeBuilder(new Orco());
            fabrica.construirPersonajeAbstracto();
        }else if(op.equals("Humano")){
            fabrica.setPersonajeBuilder(new Humano());
            fabrica.construirPersonajeAbstracto();
        }else if(op.equals("Elfo")){
            fabrica.setPersonajeBuilder(new Elfo());
            fabrica.construirPersonajeAbstracto();
        }else if(op.equals("Enano")){
            fabrica.setPersonajeBuilder(new Enano());
            fabrica.construirPersonajeAbstracto();
        }
        
        
        Personaje personajeCreado = fabrica.getPersonaje();
        JOptionPane.showMessageDialog(null, "Personaje: \n"
                + "Raza: "+personajeCreado.getRaza()+"\n"
                + "Montura: "+personajeCreado.getMontura().getTipo_montura()+"\n"
                + "Arma: "+personajeCreado.getArma().getTipo_arma()+"\n"
                + "Habilidad: "+personajeCreado.getHabilidad().getTipo_habilidad());

        
    }
    
}
