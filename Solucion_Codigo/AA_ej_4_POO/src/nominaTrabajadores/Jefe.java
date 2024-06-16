package nominaTrabajadores;

class Jefe extends Trabajador {

    private double salarioBase;

    public Jefe(String nombre, String apellidos, String direccion, String dni, double salarioBase) {
        super(nombre, apellidos, direccion, dni, null);
        this.salarioBase = salarioBase;
    }

    public double calcularSueldo() {
        return salarioBase;
    }
}
