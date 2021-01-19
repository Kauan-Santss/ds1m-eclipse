package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	// *** M�todos de acesso aos atributos da classe
	// *** getters and setters
	
	public void setTipo(String tipo) {
		if (tipo.contentEquals("Corrente") || tipo.equals("Poupan�a")) {
		this.tipo = tipo;
		}
		else {
			System.out.println("O tipo de conta deve ser Corrente ou Poupan�a");
		}
	}
	
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
