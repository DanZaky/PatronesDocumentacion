package patrondecorador;

public class Velocimetro  extends BicicletaDecorador{

    public Velocimetro(Alquilar alquilar) {
        super (alquilar);
    }
    
    public String getDescripcion() {
        return getAlquilar().getDescripcion()+ "+ Velocimetro";
    }
    public int getPrecio(){
        return getAlquilar().getPrecio()+10000;
    }
}
