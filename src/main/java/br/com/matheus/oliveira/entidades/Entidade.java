package br.com.matheus.oliveira.entidades;

import java.util.List;

public class Entidade {

	private String nome;
	private boolean construtorComCampos;
	private List<Campo> campos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isConstrutorComCampos() {
		return construtorComCampos;
	}
	public void setConstrutorComCampos(boolean construtorComCampos) {
		this.construtorComCampos = construtorComCampos;
	}
	public List<Campo> getCampos() {
		return campos;
	}
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}
}
