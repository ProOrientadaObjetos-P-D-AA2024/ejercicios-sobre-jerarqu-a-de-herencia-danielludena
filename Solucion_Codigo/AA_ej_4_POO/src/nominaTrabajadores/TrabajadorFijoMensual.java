package nominaTrabajadores;

class TrabajadorFijoMensual extends Trabajador {
    private double salarioMensual;

    public TrabajadorFijoMensual(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double salarioMensual) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.salarioMensual = salarioMensual;
    }

    public double calcularSueldo() {
        return salarioMensual;
    }
}
