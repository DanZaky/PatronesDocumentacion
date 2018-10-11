package patronproxy;

public class Candado {
    private int cod_llave;
    private int cod_seguridad;

    public Candado(int cod_llave, int cod_seguridad) {
        this.cod_llave = cod_llave;
        this.cod_seguridad = cod_seguridad;
    }

    public int getCod_llave() {
        return cod_llave;
    }

    public void setCod_llave(int cod_llave) {
        this.cod_llave = cod_llave;
    }

    public int getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(int cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }
    
}
