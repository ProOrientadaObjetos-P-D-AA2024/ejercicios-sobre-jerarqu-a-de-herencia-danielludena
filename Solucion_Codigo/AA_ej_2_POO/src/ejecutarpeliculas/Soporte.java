package ejecutarpeliculas;

public class Soporte {
    private String tipo;
    private double Gb;
    private String tipoCinta;

    public Soporte(String tipo, double Gb, String tipoCinta) {
        this.tipo = tipo;
        this.Gb = Gb;
        this.tipoCinta = tipoCinta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGb() {
        return Gb;
    }

    public void setGb(double capacidadGb) {
        this.Gb = capacidadGb;
    }

    public String getTipoCinta() {
        return tipoCinta;
    }

    public void setTipoCinta(String tipoCinta) {
        this.tipoCinta = tipoCinta;
    }
}
