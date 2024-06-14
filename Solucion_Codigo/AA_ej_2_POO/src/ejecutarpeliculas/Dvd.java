package ejecutarpeliculas;

public class Dvd extends Pelicula {
    private double Gb;

    public Dvd(String titulo, String autor, int año, String[] idiomas, double precioBase, double capacidadGb) {
        super(titulo, autor, año, idiomas, precioBase, new Soporte("DVD", capacidadGb, null));
        this.Gb = capacidadGb;
    }

    public double getGb() {
        return Gb;
    }

    public void setGb(double Gb) {
        this.Gb = Gb;
    }
}