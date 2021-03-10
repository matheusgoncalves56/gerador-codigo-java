package br.com.matheus.oliveira.services;

import br.com.matheus.oliveira.entidades.Entidade;
import br.com.matheus.oliveira.exceptions.GeradorCodigoException;
import br.com.matheus.oliveira.utils.GeradorClassesUtils;

public class GeradorCodigoService {

	public String gerarClasse(Entidade entidade) throws GeradorCodigoException {
		StringBuilder sb = new StringBuilder();
		
		if(entidade.isPossuiPacote()) 
			sb.append(GeradorClassesUtils.gerarPackage(entidade.getPacote()));
		
		if(entidade.getNome() == null || entidade.getNome().trim().isEmpty()) {
			throw new GeradorCodigoException("Não é possível gerar uma classe sem nome");
		}
		
		sb.append("class ");
		sb.append(entidade.getNome());
		sb.append(" {\n");
		
		sb.append("}");

		return sb.toString();
	}

	
}
