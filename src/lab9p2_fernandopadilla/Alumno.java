package lab9p2_fernandopadilla;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String carreraEstudia;
    private boolean becado;
    private double indiceActual;
    private double descuento;
    private int cantidadClasesAprobadas;
    private ArrayList<Asignatura> clasesCursanActualmente = new ArrayList();

    public Alumno(String carreraEstudia, boolean becado, double indiceActual, double descuento, int cantidadClasesAprobadas, String nombre, String numeroCuenta, String contrasena) {
        super(nombre, numeroCuenta, contrasena);
        this.carreraEstudia = carreraEstudia;
        this.becado = becado;
        this.indiceActual = indiceActual;
        this.descuento = descuento;
        this.cantidadClasesAprobadas = cantidadClasesAprobadas;
    }

    public String getCarreraEstudia() {
        return carreraEstudia;
    }

    public void setCarreraEstudia(String carreraEstudia) {
        this.carreraEstudia = carreraEstudia;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public double getIndiceActual() {
        return indiceActual;
    }

    public void setIndiceActual(double indiceActual) {
        this.indiceActual = indiceActual;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCantidadClasesAprobadas() {
        return cantidadClasesAprobadas;
    }

    public void setCantidadClasesAprobadas(int cantidadClasesAprobadas) {
        this.cantidadClasesAprobadas = cantidadClasesAprobadas;
    }

    public ArrayList<Asignatura> getClasesCursanActualmente() {
        return clasesCursanActualmente;
    }

    public void setClasesCursanActualmente(ArrayList<Asignatura> clasesCursanActualmente) {
        this.clasesCursanActualmente = clasesCursanActualmente;
    }

    @Override
    public String toString() {
        return "Alumno:" + 
                "carreraEstudia=" + carreraEstudia + 
                ", becado=" + becado + 
                ", indiceActual=" + indiceActual + 
                ", descuento=" + descuento + 
                ", cantidadClasesAprobadas=" + cantidadClasesAprobadas + 
                ", clasesCursanActualmente=" + clasesCursanActualmente;
    }
    
    
}