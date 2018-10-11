package patrondecorador;

public class Cambios extends BicicletaDecorador {

    public Cambios(Alquilar alquilar) {
        super (alquilar);
    }
    
    public String getDescripcion() {
        return getAlquilar().getDescripcion()+ "+ Cambios";
    }
    public int getPrecio(){
        return getAlquilar().getPrecio()+10000;
    }
}
