package patrondecorador;

public class Amortiguadores extends BicicletaDecorador {

    public Amortiguadores(Alquilar alquilar) {
        super(alquilar);
    }

    public String getDescripcion() {
        return getAlquilar().getDescripcion() + "+ Amortiguadores";
    }

    public int getPrecio() {
        return getAlquilar().getPrecio() + 10000;
    }
    
}
