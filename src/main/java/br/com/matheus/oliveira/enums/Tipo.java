package br.com.matheus.oliveira.enums;

public enum Tipo {
	STRING("String"), BOOLEAN("Boolean"), INTEGER("Integer"), LONG("Long"), DOUBLE("Double");
	
	public final String value;
	
	private Tipo(String value) {
		this.value = value;
	}
}
