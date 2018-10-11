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
public class ProductoSuma extends ProductoOperacion{
    private double sumando1;
    private double sumando2;
    
    @Override
    public void operar(double operando1, double operando2) {
        sumando1=operando1;
        sumando2=operando2;
        System.out.println(sumando1+ " + "+sumando2+" = "+(sumando1+sumando2) );
        
    }

}
