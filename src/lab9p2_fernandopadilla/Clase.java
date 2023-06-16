package lab9p2_fernandopadilla;

public class Clase extends Asignatura {
    private double costo;

    public Clase(double costo, String codigoAsignatura, String codigoSeccion, String horario, String docente, int unidadesValorativas, String aula, String edificio, int cantidadAlumnos, String modalidad, String diasImparte, double precio) {
        super(codigoAsignatura, codigoSeccion, horario, docente, unidadesValorativas, aula, edificio, cantidadAlumnos, modalidad, diasImparte, precio);
        this.costo = 0.20;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Clase:" + 
                costo;
    }
}
