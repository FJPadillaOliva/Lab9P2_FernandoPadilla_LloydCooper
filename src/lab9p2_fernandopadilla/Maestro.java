package lab9p2_fernandopadilla;

import java.util.ArrayList;

public class Maestro extends Persona {
    private String nacionalidad;
    private String titulo;
    private ArrayList<Asignatura> clasesImparte = new ArrayList();

    public Maestro(String nacionalidad, String titulo, String nombre, String numeroCuenta, String contrasena) {
        super(nombre, numeroCuenta, contrasena);
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Asignatura> getClasesImparte() {
        return clasesImparte;
    }

    public void setClasesImparte(ArrayList<Asignatura> clasesImparte) {
        this.clasesImparte = clasesImparte;
    }

    @Override
    public String toString() {
        return "Maestro:" + 
                nacionalidad + 
                titulo + 
                clasesImparte;
    }
    
    
}