/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronabstractfactory;

import patronabstractfactory.Arma;
import patronabstractfactory.ArmaHumano;
import patronabstractfactory.Escudo;
import patronabstractfactory.EscudoHumano;
import patronabstractfactory.Montura;
import patronabstractfactory.MonturaHumano;

/**
 *
 * @author Estudiantes
 */
public class FabricaHumanos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaHumano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHumano();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaHumano();
    }
    
}
