package patronproxy;

public abstract class Llave {
    protected int cod_llave;

    public int getCod_llave() {
        return cod_llave;
    }

    public void setCod_llave(int cod_llave) {
        this.cod_llave = cod_llave;
    }
    
    public abstract void Contacto(Candado candado);
    public abstract boolean LlaveCorrecta(int cod_llave);
}
