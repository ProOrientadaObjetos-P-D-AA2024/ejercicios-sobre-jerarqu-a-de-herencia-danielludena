
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

public class EntradaReducida extends Entrada {
    public EntradaReducida(String nombreComprador, Zona zona) {
        super(nombreComprador, zona);
    }

    public double calcularPrecio() {
        return getZona().getPrecioNormal() * 0.85;
    }
}