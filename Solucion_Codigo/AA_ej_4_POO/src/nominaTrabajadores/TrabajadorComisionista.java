package nominaTrabajadores;

class TrabajadorComisionista extends Trabajador {
    private double comision;
    private double ventasTotales;

    public TrabajadorComisionista(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double comision, double ventasTotales) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.comision = comision;
        this.ventasTotales = ventasTotales;
    }

    public double calcularSueldo() {
        return (comision / 100) * ventasTotales;
    }
}
