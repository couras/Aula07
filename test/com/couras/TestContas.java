package com.couras;

import java.util.ArrayList;
import java.util.List;

public class TestContas {

	public static void main(String[] args) {
		Cliente cliente  = new Cliente("maria", GeneroEnum.FEMININO, "2966652144", "25685422255");
		Cliente cliente2  = new Cliente("joao", GeneroEnum.MASCULINO, "2966652144", "25685422255");

		ContaCorrente cc = new ContaCorrente(cliente);
		cc.depositar(1500);
		
		System.out.println("Deposito realizado na conta corrente: R$ " + cc.getSaldo());
		System.out.println("Saldo conta corrente: R$ " + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(cliente2);
		cc.transfere(cp, 300);
		
		System.out.println("Transferência para poupança R$ " + cp.getSaldo());
		
		System.out.println("Saldo conta corrente: R$ " + cc.getSaldo());
		System.out.println("Saldo conta poupança: R$ " + cp.getSaldo());
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(cc);
		contas.add(cp);
		
		Banco banco = new Banco(contas);
		
		System.out.println("Total Contas: R$ " + banco.totalContas());
		String retorno = "";
		for(Conta conta : contas) {
			retorno += "Cliente: " + conta.getCliente().getNome() + " Valor: R$ " + conta.getSaldo();
			retorno += " / ";
		}
		
		System.out.println(retorno);
	}

}
