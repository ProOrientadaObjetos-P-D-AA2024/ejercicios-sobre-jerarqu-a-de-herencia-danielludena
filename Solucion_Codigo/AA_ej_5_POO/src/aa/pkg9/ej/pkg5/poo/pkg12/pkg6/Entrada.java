
package aa.pkg9.ej.pkg5.poo.pkg12.pkg6;

class Entrada {
    private static int contadorEntradas = 1;

    private int identificador;
    private String nombreComprador;
    private Zona zona;

    public Entrada(String nombreComprador, Zona zona) {
        this.identificador = contadorEntradas++;
        this.nombreComprador = nombreComprador;
        this.zona = zona;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public Zona getZona() {
        return zona;
    }

    public double calcularPrecio() {
        return zona.getPrecioNormal();
    }
}

class EntradaAbonado extends Entrada {
    public EntradaAbonado(String nombreComprador, Zona zona) {
        super(nombreComprador, zona);
    }

    public double calcularPrecio() {
        return getZona().getPrecioAbonado();
    }
}

class EntradaNormal extends Entrada {
    public EntradaNormal(String nombreComprador, Zona zona) {
        super(nombreComprador, zona);
    }
}

class EntradaReducida extends Entrada {
    public EntradaReducida(String nombreComprador, Zona zona) {
        super(nombreComprador, zona);
    }

    public double calcularPrecio() {
        return getZona().getPrecioNormal() * 0.85;
    }
}
