package patronproxy;

import javax.swing.JOptionPane;

public class LlaveReal extends Llave{

    public LlaveReal(int cod_llave) {
        this.cod_llave = cod_llave;
    }

    @Override
    public void Contacto(Candado candado) {
        if(LlaveCorrecta(candado.getCod_llave())){
            JOptionPane.showMessageDialog(null, "La llave hizo contacto");
        }else{
            JOptionPane.showMessageDialog(null, "Llave invalida");
        }
    }

    @Override
    public boolean LlaveCorrecta(int cod_llave) {
        return cod_llave == this.cod_llave;
    }
    
}
