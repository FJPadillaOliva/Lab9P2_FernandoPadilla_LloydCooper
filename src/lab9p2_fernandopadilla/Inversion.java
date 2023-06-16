package lab9p2_fernandopadilla;

public class Inversion {
    private String codigoAsignatura;
    private String nombreAsignatura;
    private double costo;

    public Inversion(String codigoAsignatura, String nombreAsignatura, double costo) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.costo = costo;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Inversion:" + 
                "codigoAsignatura=" + codigoAsignatura + 
                ", nombreAsignatura=" + nombreAsignatura + 
                ", costo=" + costo;
    }
    
    
}
