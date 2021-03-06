package br.com.matheus.oliveira.entidades;

import br.com.matheus.oliveira.enums.Tipo;

public class Campo {
	
	private String nome;
	private Tipo tipo;
	
	public Campo() {}

	public Campo(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
