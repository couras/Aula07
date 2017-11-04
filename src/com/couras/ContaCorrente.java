package com.couras;

public class ContaCorrente extends Conta implements InterfaceTaxaBancaria  {
	public ContaCorrente(Cliente cliente) {
		this.setCliente(cliente);
	}

	@Override
	public double tarifa() {
		double valor = super.getSaldo() * 0.1;
		return valor;
	}
}
