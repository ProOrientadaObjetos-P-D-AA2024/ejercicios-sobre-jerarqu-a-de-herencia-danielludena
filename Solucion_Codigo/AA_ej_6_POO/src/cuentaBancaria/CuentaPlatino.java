
package cuentaBancaria;

class CuentaPlatino extends CuentaBancaria {
    private static final double INTERES = 0.10;

    public CuentaPlatino(String idCuenta, String titular) {
        super(idCuenta, titular);
    }

    public void aplicarInteres() {
        double interes = saldo * INTERES;
        depositar(interes);
    }
}