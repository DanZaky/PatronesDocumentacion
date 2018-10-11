package patronadapter;

public abstract class Cambio {
    int ratio;
    Adaptable adap = new Adaptable();
    public abstract float cambioRatio();
}
