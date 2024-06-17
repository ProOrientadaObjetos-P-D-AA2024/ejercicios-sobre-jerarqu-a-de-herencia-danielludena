package cuentaBancaria;

public class Ejecutor {

    public static void main(String[] args) {
        
        CuentaCheques cuentaCheques = new CuentaCheques("65872674735", "Jeremias Pineda");
        CuentaAhorros cuentaAhorros = new CuentaAhorros("29487364872", "Mateo Merchan");
        CuentaPlatino cuentaPlatino = new CuentaPlatino("74628492765", "Nicolas Eguiguren");

        cuentaCheques.depositar(500);
        cuentaCheques.retirar(200);

        cuentaAhorros.depositar(150);
        cuentaAhorros.aplicarInteres();

        cuentaPlatino.depositar(5000);
        cuentaPlatino.aplicarInteres(); 

        System.out.println(cuentaCheques);
        System.out.println(cuentaAhorros);
        System.out.println(cuentaPlatino);
    }
}

