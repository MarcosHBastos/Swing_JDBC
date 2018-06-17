
package modelo;

public class Conta {

    private double saldo;
    private double depositoInicial;

    public Conta(double saldo, double depositoInicial) {
        this.saldo = saldo;
        this.depositoInicial = depositoInicial;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean deposita(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean saca(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public interface ContaI {

        public boolean deposita(double valor);

        public boolean saca(double valor);

        public Cliente getDono();

        public int getNumero();

        public double getSaldo();

        public void remunera();
    }
}
