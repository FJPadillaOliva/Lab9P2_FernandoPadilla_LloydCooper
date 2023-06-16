package lab9p2_fernandopadilla;

public class Persona {
    private String nombre;
    private String numeroCuenta;
    private String contrasena;

    public Persona(String nombre, String numeroCuenta, String contrasena) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", contrasena=" + contrasena + '}';
    }
    
    
}
