package br.com.matheus.oliveira.enums;

public enum Modificador {
	PUBLIC("public"), PROTECTED("protected"), PRIVATE("private");
	
	public final String value;
	
	Modificador(String value) {
		this.value = value;
	}
}
