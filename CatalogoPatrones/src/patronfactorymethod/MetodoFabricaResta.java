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
public class MetodoFabricaResta extends FabricaAbstractaOperaciones{
    
    
    @Override
    public ProductoOperacion fabricar() {
        return new ProductoResta();
    
    }

}
