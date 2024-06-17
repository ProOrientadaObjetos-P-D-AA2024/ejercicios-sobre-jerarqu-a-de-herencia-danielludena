package cuentaBancaria;


class CuentaAhorros extends CuentaBancaria {
    private static final double INTERES = 0.05;

    public CuentaAhorros(String idCuenta, String titular) {
        super(idCuenta, titular);
    }

    public void aplicarInteres() {
        double interes = saldo * INTERES;
        depositar(interes);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
            } else {
                System.out.println("Fondos insuficientes en la cuenta de ahorros.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }
}