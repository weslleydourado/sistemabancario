package Conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
	
	private Cliente cliente;

	private int numeroConta;
	private double saldo;
	
	public ContaCorrente(Cliente cliente, int numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	public ContaCorrente() {
	}

	public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }
	
	public void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
	
	public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
	
}
