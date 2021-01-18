package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	public void depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		else {
			System.out.println("Valor Inv�lido!!!");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: R$" + saldo);
		System.out.println("Saldo + Limite: R$" + (saldo + chequeEspecial));
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		}
		else {
			System.out.println("Valor Insuficiente!!!");
		}
	}
	
	public void transferir() {
		
	}
}
