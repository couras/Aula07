package com.couras;

public class ContaPoupanca extends Conta implements InterfaceTaxaBancaria {

	public ContaPoupanca(Cliente cliente) {
		this.setCliente(cliente);
	}

	@Override
	public double tarifa() {
		double valor = super.getSaldo() * 0.05;
		return valor;
	}
}
