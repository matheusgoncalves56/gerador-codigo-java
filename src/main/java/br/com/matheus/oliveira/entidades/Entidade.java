package br.com.matheus.oliveira.entidades;

import java.util.List;

public class Entidade {

	private String nome;
	private String pacote;
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
	public String getPacote() {
		return pacote;
	}
	public void setPacote(String pacote) {
		this.pacote = pacote;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("package ");
		sb.append(pacote);
		sb.append("\n\n");
		
		// TODO Auto-generated method stub
		return super.toString();
	}
}
