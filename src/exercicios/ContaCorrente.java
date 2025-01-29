package exercicios;

import java.util.Date;

public class ContaCorrente {
    int conta;
    int agencia;
    String nomeCliente;
    Date dataNascimento;
    double saldo;
    boolean ativa = true;

    public ContaCorrente(int conta, int agencia, String nomeCliente, Date dataNascimento, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldo = saldo;
    }


    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }
    }

    public void cancelarConta(String justificativa){
        if (this.saldo > 0) {
            System.out.println("Conta com saldo positivo");
        } else {
            System.out.println("Conta cancelada por: " + justificativa);
            this.ativa = false;
        }
    }

    public void extratoPorPeriodo(Date inicio, Date fim) {
        System.out.println("Extrato do período de " + inicio + " até " + fim);
    }

    public void saldoAtual() {
        System.out.println("Saldo atual: " + this.saldo);
    }


}
