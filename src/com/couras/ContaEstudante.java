package com.couras;

import javax.management.RuntimeErrorException;

public class ContaEstudante extends Conta {
	
	public ContaEstudante(Cliente cliente) {
		this.setCliente(cliente);
	}
}
