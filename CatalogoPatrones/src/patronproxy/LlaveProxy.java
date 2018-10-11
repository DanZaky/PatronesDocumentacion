package patronproxy;

import javax.swing.JOptionPane;

public class LlaveProxy extends Llave{
    
    private Llave llave_original;

    public LlaveProxy(Llave llave) {
        this.llave_original = llave;
    }
    

    @Override
    public void Contacto(Candado candado) {
        if(candado.getCod_seguridad()>=llave_original.getCod_llave()){
            JOptionPane.showMessageDialog(null, "Llave incorrecta, abortando...");
            return;
        }
        
        if(LlaveCorrecta(candado.getCod_llave())){
            JOptionPane.showMessageDialog(null, "La llave hizo contacto");
        }else{
            JOptionPane.showMessageDialog(null, "Llave invalida");
        }
    }

    @Override
    public boolean LlaveCorrecta(int cod_llave) {
        return llave_original.LlaveCorrecta(cod_llave);
    }
    
}
