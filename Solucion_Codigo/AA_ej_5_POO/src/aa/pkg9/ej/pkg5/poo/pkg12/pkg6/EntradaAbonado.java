
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

public class EntradaAbonado extends Entrada {
    public EntradaAbonado(String nombreComprador, Zona zona) {
        super(nombreComprador, zona);
    }

    public double calcularPrecio() {
        return getZona().getPrecioAbonado();
    }
}
