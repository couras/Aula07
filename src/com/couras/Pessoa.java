package com.couras;

import java.util.Date;

public class Pessoa {
	private String nome;
	private GeneroEnum sexo;
	
	
	
	public Pessoa(String nome, GeneroEnum sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GeneroEnum getSexo() {
		return sexo;
	}

	public void setSexo(GeneroEnum sexo) {
		this.sexo = sexo;
	}
}
