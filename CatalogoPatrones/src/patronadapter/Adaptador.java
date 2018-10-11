package patronadapter;

public class Adaptador extends Cambio{
    
    float cambio;
    @Override
    public float cambioRatio() {
        ratio = adap.captura();
        cambio = (float)(ratio*2.54);
        return cambio;
    }
    
}
