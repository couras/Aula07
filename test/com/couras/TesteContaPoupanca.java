package com.couras;

public class TesteContaPoupanca  {
	public static void main(String[] args) {
		Cliente cliente  = new Cliente("maria", GeneroEnum.FEMININO, "2966652144", "25685422255");
		Cliente cliente2  = new Cliente("joao", GeneroEnum.MASCULINO, "2966652144", "25685422255");
		
		ContaPoupanca c1 = new ContaPoupanca(cliente);
		c1.depositar(150);
		ContaPoupanca c2 = new ContaPoupanca(cliente2);
		
		if(c1.transfere(c2, 30)) {
			System.out.println("transferencia de poupança");
			System.out.println("Saldo origem -> R$ " + c1.getSaldo());
			System.out.println("Saldo destino -> R$ " + c2.getSaldo());
		} else {
			System.out.println("saldo da poupança indisponível");
		}
	}	
}
