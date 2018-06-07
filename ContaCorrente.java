/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class ContaCorrente extends Conta {

    private int numeroConta;
    private double limite;

    public ContaCorrente(int numeroConta, double limite, double saldo, double depositoInicial) {
        super(saldo, depositoInicial);
        this.numeroConta = numeroConta;
        this.limite = limite;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saca(double valor) {
        if (valor > limite) {
            super.saca(valor);
            return true;
        } else {
            return false;
        }
    }

    public void remunera() {
        this.setSaldo((this.getSaldo() * 1.01));
    }

    @Override
    public boolean deposita(double valor){
        return (super.deposita(valor));
    }
}
