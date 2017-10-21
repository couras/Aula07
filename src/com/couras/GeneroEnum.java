package com.couras;

public enum GeneroEnum {
	FEMININO("F"),
	MASCULINO("M"),
	OUTROS("0");
	
	private String genero;
	
	private GeneroEnum(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
}
