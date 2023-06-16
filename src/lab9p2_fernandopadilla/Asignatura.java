package lab9p2_fernandopadilla;

public class Asignatura {
    private String codigoAsignatura;
    private String codigoSeccion;
    private String horario;
    private String docente;
    private int unidadesValorativas;
    private String aula;
    private String edificio;
    private int cantidadAlumnos;
    private String modalidad;
    private String diasImparte;
    private double precio;

    public Asignatura(String codigoAsignatura, String codigoSeccion, String horario, String docente, int unidadesValorativas, String aula, String edificio, int cantidadAlumnos, String modalidad, String diasImparte, double precio) {
        this.codigoAsignatura = codigoAsignatura;
        this.codigoSeccion = codigoSeccion;
        this.horario = horario;
        this.docente = docente;
        this.unidadesValorativas = unidadesValorativas;
        this.aula = aula;
        this.edificio = edificio;
        this.cantidadAlumnos = cantidadAlumnos;
        this.modalidad = modalidad;
        this.diasImparte = diasImparte;
        this.precio = precio;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getCodigoSeccion() {
        return codigoSeccion;
    }

    public void setCodigoSeccion(String codigoSeccion) {
        this.codigoSeccion = codigoSeccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getUnidadesValorativas() {
        return unidadesValorativas;
    }

    public void setUnidadesValorativas(int unidadesValorativas) {
        this.unidadesValorativas = unidadesValorativas;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getDiasImparte() {
        return diasImparte;
    }

    public void setDiasImparte(String diasImparte) {
        this.diasImparte = diasImparte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Asignatura:" + 
                "codigoAsignatura=" + codigoAsignatura + 
                ", codigoSeccion=" + codigoSeccion + 
                ", horario=" + horario + 
                ", docente=" + docente + 
                ", unidadesValorativas=" + unidadesValorativas + 
                ", aula=" + aula + 
                ", edificio=" + edificio + 
                ", cantidadAlumnos=" + cantidadAlumnos + 
                ", modalidad=" + modalidad + 
                ", diasImparte=" + diasImparte + 
                ", precio=" + precio;
    }
    
    
}

