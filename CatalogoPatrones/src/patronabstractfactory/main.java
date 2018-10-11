/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronabstractfactory;

/**
 *
 * @author Estudiantes
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaAbstracta fabrica;
        Arma arma;
        Escudo escudo;
        Montura montura;
        
        fabrica = new FabricaElfos();
        
        arma = fabrica.crearArma();
        arma.crearArma();
        escudo = fabrica.crearEscudo();
        escudo.crearEscudo();
        montura = fabrica.crearMontura();
        montura.crearMontura();
        
        
        fabrica = new FabricaHumanos();
        
        arma = fabrica.crearArma();
        arma.crearArma();
        escudo = fabrica.crearEscudo();
        escudo.crearEscudo();
        montura = fabrica.crearMontura();
        montura.crearMontura();
        
    }
    
}
