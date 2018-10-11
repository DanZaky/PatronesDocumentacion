/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronfactorymethod;

/**
 *
 * @author Daniel
 */
public class Cliente {

    private FabricaAbstractaOperaciones objSuma;
    private FabricaAbstractaOperaciones objResta;

    public Cliente() {
        objSuma = new MetodoFabricaSuma();
        objResta = new MetodoFabricaResta();
        objSuma.fabricar().operar(1, 2);
        objResta.fabricar().operar(2, 1);
    }

    public static void main(String[] args) {
        
        new Cliente();
    }

    
}
