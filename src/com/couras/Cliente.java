package com.couras;

public class Cliente extends Pessoa {

	private String rg;
	private String cpf;
	
	public Cliente(String nome, GeneroEnum sexo, String rg, String cpf) {
		super(nome, sexo);
		this.cpf = cpf;
		this.rg = rg;
	}
}
