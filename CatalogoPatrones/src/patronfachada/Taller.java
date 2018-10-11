package patronfachada;

public class Taller {
    private String consulta;

    public Taller(String consulta) {
        this.consulta = consulta;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    
    public void consulta(){
        if(consulta.equalsIgnoreCase("Llantas")){
            TLlantas taller_llantas = new TLlantas();
            taller_llantas.RevisarLlantas();
        }else if(consulta.equalsIgnoreCase("Cadena")){
            TCadena taller_cadena = new TCadena();
            taller_cadena.RevisarCadena();
        }
    }
}
