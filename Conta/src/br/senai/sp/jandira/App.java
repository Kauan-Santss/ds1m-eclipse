package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		// *** Conta da Ana
		Conta contaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaAnaGomes.setTitular("Ana Gomes");
		contaAnaGomes.setNumero("111-98");
		contaAnaGomes.setTipo("Poupan�a");
		contaAnaGomes.setAtiva(true);
		contaAnaGomes.setChequeEspecial(200);
		contaAnaGomes.depositar(100);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.depositar(30);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.sacar(50);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.sacar(50);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.sacar(80);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.depositar(100);
		contaAnaGomes.consultarSaldo();
		contaAnaGomes.getSaldo();
		
		double saldoDaConta = contaAnaGomes.getSaldo();
		
		System.out.println("Saldo da conta: R$" + saldoDaConta);
		
//		System.out.println("Titular da Conta: " + contaAnaGomes.getTitular());
		System.out.println("Tipo de Conta: " + contaAnaGomes.getTipo());
		System.out.println("N�mero da Conta: " + contaAnaGomes.getNumero());
		System.out.println("Valor do Cheque Especial: R$" + contaAnaGomes.getChequeEspecial());
		
		Cliente cliente = new Cliente();
	}
}
