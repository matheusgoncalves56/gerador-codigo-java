package br.com.matheus.oliveira.utils;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
		Assert.assertTrue(possuiCampo);
	}
}
