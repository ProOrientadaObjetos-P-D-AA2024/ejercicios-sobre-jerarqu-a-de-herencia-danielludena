
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

class Zona {
    
    private String nombre;
    private int capacidad;
    private double precioNormal;
    private double precioAbonado;
    private int entradasVendidas;

    public Zona(String nombre, int capacidad, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
        this.entradasVendidas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public int getEntradasDisponibles() {
        return capacidad - entradasVendidas;
    }

    public boolean venderTicket() {
        if (entradasVendidas < capacidad) {
            entradasVendidas++;
            return true;
        } else {
            return false;
        }
    }
}
