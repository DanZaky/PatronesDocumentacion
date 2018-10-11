/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

/**
 *
 * @author Daniel
 */
public class Bicicleta {
    private static Bicicleta instance;
    private String tipoBicicleta;
    
    private Bicicleta(){
    }
    
    public static Bicicleta getInstance(){
        if(instance == null){
            instance = new Bicicleta();
        }
        return instance;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    
}
