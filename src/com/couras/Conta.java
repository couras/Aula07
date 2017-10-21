package com.couras;

public abstract class Conta {
	public double saldo;
	private Cliente cliente;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		
		 if(valor <= this.saldo) {
			 this.saldo -= valor;
			 return true;
		 }
			 	
		 return false;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public boolean transfere(Conta destino, double valor) {
		if(sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		
		return false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
