package com.couras;

public class TesteContaCorrente {
	public static void main(String[] args) {
		Cliente cliente  = new Cliente("maria", GeneroEnum.FEMININO, "2966652144", "25685422255");
		Cliente cliente2  = new Cliente("joao", GeneroEnum.MASCULINO, "2966652144", "25685422255");
		
		ContaCorrente c1 = new ContaCorrente(cliente);
		c1.depositar(150);
		ContaCorrente c2 = new ContaCorrente(cliente2);
		
		if(c1.transfere(c2, 20)) {
			System.out.println("transferencia de conta corrente");
			System.out.println("Saldo origem -> R$ " + c1.getSaldo());
			System.out.println("Saldo destino -> R$ " + c2.getSaldo());
		} else {
			System.out.println("saldo de conta corrente indisponível");
		}
	}	
}
