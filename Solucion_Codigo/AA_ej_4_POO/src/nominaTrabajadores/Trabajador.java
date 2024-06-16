package nominaTrabajadores;

class Trabajador {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private Trabajador jefe;

    public Trabajador(String nombre, String apellidos, String direccion, String dni, Trabajador jefe) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.jefe = jefe;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }
}
