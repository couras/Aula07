package com.couras;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public Banco() {
		// TODO Auto-generated constructor stub
	}
	
	double valorTotal;
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
	
	public void addContas(Conta conta) {
		this.valorTotal += conta.getSaldo();
		this.contas.add(conta);
	}
	
	public Banco(List<Conta> contas) {
		this.contas = contas;
	}

	public double getValorTotal() {
		return valorTotal;
	}
}
