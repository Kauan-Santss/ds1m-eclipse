package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Conta contaAnaMaria;
		Conta contaPedro;
		
		contaAnaMaria = new Conta();
		contaPedro = new Conta();
		
		// *** CONTA DA MARIA
		contaAnaMaria.numero = "111-0";
		contaAnaMaria.titular = "Ana Maria Braga";
		contaAnaMaria.tipo = "Corrente";
		contaAnaMaria.ativa = true;
		contaAnaMaria.depositar(100);
		contaAnaMaria.consultarSaldo();
		contaAnaMaria.depositar(300);
		contaAnaMaria.consultarSaldo();
		
		// *** CONTA DO PEDRO
		contaPedro.numero = "222-0";
		contaPedro.titular = "Pedro Cabral";
		contaPedro.tipo = "Poupan�a";
		contaPedro.ativa = true;
		
	}

}
