public class Saldo {
    private Integer saldoAntiguo;
    private Integer saldoNuevo;


    public Integer getSaldoAntiguo() {
        return saldoAntiguo;
    }

    public void setSaldoAntiguo(Integer saldoAntiguo) {
        this.saldoAntiguo = saldoAntiguo;
    }

    public Integer getSaldoNuevo() {
        return saldoNuevo;
    }

    public void setSaldoNuevo(Integer saldoNuevo) {
        this.saldoNuevo = saldoNuevo;
    }

    @Override
    public String toString() {
        return "Saldo{" +
                "saldoAntiguo=" + saldoAntiguo +
                ", saldoNuevo=" + saldoNuevo +
                '}';
    }
}
