package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular; 
	private boolean ativa;
	private double chequeEspecial;
	
	public void setTipo(String tipo) {
		if (tipo.contentEquals("Corrente") || tipo.equals("Poupan�a")) {
		this.tipo = tipo;
		}
		else {
			System.out.println("O tipo de conta deve ser: Corrente ou Poupan�a");
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setTitular (Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public boolean isAtiva(boolean ativa) {
		return this.ativa;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public double getChequeEspecial() {
		return this.chequeEspecial;
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
