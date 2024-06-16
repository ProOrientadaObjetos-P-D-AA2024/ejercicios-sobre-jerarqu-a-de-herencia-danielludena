package nominaTrabajadores;

public class Ejecutor {

    public static void main(String[] args) {

        Jefe jefe = new Jefe("Carlos", "Martinez", "Calle Principal", "1203948576", 3200.0);
        TrabajadorFijoMensual trabajador1 = new TrabajadorFijoMensual("Juan", "Perez", "Av Central", "1983746512", jefe, 1100.0);
        TrabajadorComisionista trabajador2 = new TrabajadorComisionista("Laura", "Gomez", "Calle Secundaria", "128374956", jefe, 18.0, 5200);
        TrabajadorPorHoras trabajador3 = new TrabajadorPorHoras("Ana", "Ramirez", "Boulevard y Primera", "1174836524", jefe, 18.0, 25.0, 38);

        System.out.println("Jefe: " + jefe.getNombreCompleto() + ", Sueldo: " + jefe.calcularSueldo());
        System.out.println("Trabajador Fijo Mensual: " + trabajador1.getNombreCompleto() + ", Sueldo: " + trabajador1.calcularSueldo());
        System.out.println("Trabajador Comisionista: " + trabajador2.getNombreCompleto() + ", Sueldo: " + trabajador2.calcularSueldo());
        System.out.println("Trabajador por Horas: " + trabajador3.getNombreCompleto() + ", Sueldo: " + trabajador3.calcularSueldo());
    }
}
