package cuentaBancaria;


class CuentaBancaria {
    protected String idCuenta;
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String idCuenta, String titular) {
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            saldo -= monto;
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
    
    public String toString() {
        return "Titular: " + titular + ", Cuenta: " + idCuenta + ", Saldo: " + saldo;
    }
}
