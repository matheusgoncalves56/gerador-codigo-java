package br.com.matheus.oliveira.utils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.matheus.oliveira.entidades.Campo;
import br.com.matheus.oliveira.enums.Tipo;

public class CampoUtilsTest {

	@Test
	public void deveRetornarQueExisteCampoList() {
		// cenario
		List<Campo> campos = new ArrayList<Campo>();
		campos.add(new Campo("teste1", Tipo.BOOLEAN));
		campos.add(new Campo("teste2", Tipo.LIST));
		campos.add(new Campo("teste3", Tipo.STRING));
		
		// acao
		boolean possuiCampo = CampoUtils.possuiCampoList(campos);
	
		//verificacao
		assertThat(possuiCampo, is(true));
	}
	
	@Test
	public void deveRetornarQueNaoExisteCampoList() {
		// cenario
		List<Campo> campos = new ArrayList<Campo>();
		campos.add(new Campo("teste1", Tipo.BOOLEAN));
		campos.add(new Campo("teste3", Tipo.STRING));
		
		// acao
		boolean possuiCampo = CampoUtils.possuiCampoList(campos);
	
		//verificacao
		assertThat(possuiCampo, is(false));
	}
}
