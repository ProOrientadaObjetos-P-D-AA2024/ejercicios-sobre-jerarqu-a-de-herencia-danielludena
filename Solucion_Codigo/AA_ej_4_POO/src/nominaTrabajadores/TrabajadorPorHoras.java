package nominaTrabajadores;

class TrabajadorPorHoras extends Trabajador {

    private double tarifaHora;
    private double tarifaHoraExtra;
    private int horasTotales;

    public TrabajadorPorHoras(String nombre, String apellidos, String direccion, String dni, Trabajador jefe, double tarifaHora, double tarifaHoraExtra, int horasTotales) {
        super(nombre, apellidos, direccion, dni, jefe);
        this.tarifaHora = tarifaHora;
        this.tarifaHoraExtra = tarifaHoraExtra;
        this.horasTotales = horasTotales;
    }

    public double calcularSueldo() {
        if (horasTotales <= 40) {
            return horasTotales * tarifaHora;
        } else {
            return (40 * tarifaHora) + ((horasTotales - 40) * tarifaHoraExtra);
        }
    }
}
