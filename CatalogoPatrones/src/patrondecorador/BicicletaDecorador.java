package patrondecorador;

public abstract class BicicletaDecorador implements Alquilar {

    private Alquilar alquilar;
    
    public BicicletaDecorador(Alquilar alquilar){
        setAlquilar (alquilar);
    }
    
    public Alquilar getAlquilar() {
        return alquilar;
    }

    public void setAlquilar(Alquilar alquilar) {
        this.alquilar = alquilar;
    }

    
}
