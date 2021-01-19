package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		// *** Conta da Ana
		Conta contaDaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
		contaDaAna.titular = "Ana Gomes";
		contaDaAna.numero = "111-98";
		contaDaAna.setTipo("Ab�bora");
		contaDaAna.ativa = true;
		contaDaAna.chequeEspecial = 200;
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(30);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(50);
		contaDaAna.consultarSaldo();
		contaDaAna.sacar(80);
		contaDaAna.consultarSaldo();
		contaDaAna.depositar(100);
		contaDaAna.consultarSaldo();
		contaDaAna.getSaldo();
		
		double saldoDaConta = contaDaAna.getSaldo();
		
		System.out.println("Saldo da conta: R$" + saldoDaConta);
		
		// *** Conta do Jo�o
		contaDoJoao.setTipo("Corrente");
	}
}
