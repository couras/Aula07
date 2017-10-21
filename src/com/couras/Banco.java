package com.couras;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<Conta> contas = new ArrayList<Conta>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Conta> listarContas() {
		return contas;
	}
	
	public double totalContas() {
		
		double retorno = 0;
		for(Conta conta : this.contas) {
			retorno += conta.getSaldo();
		}
			
		return retorno;
	}

	public Banco(List<Conta> contas) {
		this.contas = contas;
	}
}
