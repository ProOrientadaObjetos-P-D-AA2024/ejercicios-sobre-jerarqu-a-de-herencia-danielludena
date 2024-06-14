package ejecutarpeliculas;

public class Vhs extends Pelicula {
    private String tipoCinta;

    public Vhs(String titulo, String autor, int año, String[] idiomas, double precioBase, String tipoCinta) {
        super(titulo, autor, año, idiomas, precioBase, new Soporte("VHS", 0, tipoCinta));
        this.tipoCinta = tipoCinta;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public void setTipoCinta(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }
}