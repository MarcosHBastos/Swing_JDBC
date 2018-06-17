
package modelo;

public class ContaInvestimento extends Conta {

    private double depositoMinimo;
    private double montanteMinimo;

    public ContaInvestimento(double depositoMinimo, double montanteMinimo, double saldo, double depositoInicial) {
        super(saldo, depositoInicial);
        this.depositoMinimo = depositoMinimo;
        this.montanteMinimo = montanteMinimo;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    public void setDepositoMinimo(double depositoMinimo) {
        this.depositoMinimo = depositoMinimo;
    }

    public double getMontanteMinimo() {
        return montanteMinimo;
    }

    public void setMontanteMinimo(double montanteMinimo) {
        this.montanteMinimo = montanteMinimo;
    }

    public boolean deposita(double valor) {
        if (valor >= this.depositoMinimo) {
            super.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean saca(double valor) {
        if ((this.getSaldo() - valor) >= this.montanteMinimo) {
            super.saca(valor);
            return true;
        } else {
            return false;
        }
    }

    public void remunera() {
        this.setSaldo((this.getSaldo() * 1.02));
    }
}
