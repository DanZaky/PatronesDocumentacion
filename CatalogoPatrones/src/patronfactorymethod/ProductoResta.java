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
public class ProductoResta extends ProductoOperacion{
    private double minuendo;
    private double sustraendo;
    @Override
    public void operar(double operando1, double operando2) {
        this.minuendo= operando1;
        this.sustraendo= operando2;
        System.out.println(+minuendo+ " - "+sustraendo+" = "+(minuendo-sustraendo) );
        
    }

}
