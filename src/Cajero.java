public class Cajero {

    private String tipoCuenta;
    private String numeroCuenta;
    private String contraseña;

    private Saldo saldo;


    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "tipoCuenta='" + tipoCuenta + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
