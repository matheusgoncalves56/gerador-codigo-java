package br.com.matheus.oliveira.entidades;

import java.util.List;

import br.com.matheus.oliveira.enums.Modificador;
import br.com.matheus.oliveira.utils.GeradorClassesUtils;

public class Entidade {

	
	private String nome;
	private boolean possuiPacote;
	private String pacote;
	private Modificador modificador;
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
	
	public boolean isPossuiPacote() {
		return possuiPacote;
	}
	public void setPossuiPacote(boolean possuiPacote) {
		this.possuiPacote = possuiPacote;
	}
	
	public Modificador getModificador() {
		return modificador;
	}
	public void setModificador(Modificador modificador) {
		this.modificador = modificador;
	}
	
	@Override
	public String toString() {
		return "Entidade [nome=" + nome + ", possuiPacote=" + possuiPacote + ", pacote=" + pacote + ", modificador="
				+ modificador + ", construtorComCampos=" + construtorComCampos + ", campos=" + campos + "]";
	}
}
