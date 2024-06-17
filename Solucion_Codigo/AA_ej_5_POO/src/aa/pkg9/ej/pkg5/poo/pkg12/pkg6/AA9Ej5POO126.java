package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

import java.util.ArrayList;
import java.util.List;

public class AA9Ej5POO126 {
    
    private static List<Entrada> listaEntradas = new ArrayList<>();

    public static void main(String[] args) {
        
        Zona zonaA = new Zona("Zona A", 300, 50, 35);
        Zona zonaB = new Zona("Zona B", 150, 60, 45);
        Zona zonaC = new Zona("Zona C", 500, 25, 18);
        Zona zonaD = new Zona("Zona D", 200, 20, 12);

        venderEntrada("David", new EntradaNormal("David", zonaA));
        venderEntrada("Jose", new EntradaAbonado("Jose", zonaC));
        venderEntrada("Daniel", new EntradaReducida("Daniel", zonaD));

        consultarEntrada(1);
        consultarEntrada(2);
        consultarEntrada(3);
        consultarEntrada(4);
    }

    public static void venderEntrada(String cliente, Entrada entrada) {
        Zona zona = entrada.getZona();
        if (zona.venderTicket()) {
            System.out.println("Entrada vendida a " + cliente + " - ID: " + entrada.getIdentificador()
                    + " - Precio: " + entrada.calcularPrecio() + "$ - Zona: " + zona.getNombre());
            listaEntradas.add(entrada);
        } else {
            System.out.println("Lo siento, la " + zona.getNombre() + " está completa.");
        }
    }

    public static void consultarEntrada(int id) {
        Entrada entrada = buscarEntradaPorId(id);
        if (entrada != null) {
            System.out.println("Entrada " + id + ": "
                    + "Comprador: " + entrada.getNombreComprador()
                    + ", Precio: " + entrada.calcularPrecio() + "$"
                    + ", Zona: " + entrada.getZona().getNombre());
        } else {
            System.out.println("No se encontró ninguna entrada con el ID " + id);
        }
    }

    public static Entrada buscarEntradaPorId(int id) {
        for (Entrada entrada : listaEntradas) {
            if (entrada.getIdentificador() == id) {
                return entrada; 
            }
        }
        return null; 
    }
}

