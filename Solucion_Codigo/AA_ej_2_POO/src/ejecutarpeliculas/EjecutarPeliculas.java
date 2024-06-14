package ejecutarpeliculas;

public class EjecutarPeliculas {

    public static void main(String[] args) {
        Dvd dvd1 = new Dvd("StarWars", "George Lucas", 1977, new String[]{"Ingles", "Español"}, 15.0, 4.7);
        Vhs vhs1 = new Vhs("BeetleJuice", "Tim Burton", 1988, new String[]{"Ingles"}, 10.0, "Tipo I");

        imprimirDatos(dvd1);
        imprimirDatos(vhs1);
    }

    public static void imprimirDatos(Pelicula pelicula) {
        System.out.println("Datos de la pelicula:");
        System.out.println("Titulo: " + pelicula.getTitulo());
        System.out.println("Director: " + pelicula.getAutor());
        System.out.println("Anio: " + pelicula.getAño());
        System.out.print("Idiomas: ");
        System.out.println(String.join(", ", pelicula.getIdiomas()));
        if (pelicula instanceof Dvd) {
            Dvd dvd = (Dvd) pelicula;
            System.out.println("Capacidad: " + dvd.getGb() + " GB");
        } else if (pelicula instanceof Vhs) {
            Vhs vhs = (Vhs) pelicula;
            System.out.println("Tipo de cinta: " + vhs.getTipoCinta());
        }
        System.out.println("Precio de alquiler: " + pelicula.calcularPrecioAlquiler());
        System.out.println("Soporte: " + pelicula.getSoporte().getTipo());
        System.out.println();
    }
}