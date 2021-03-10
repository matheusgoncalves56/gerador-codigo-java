package br.com.matheus.oliveira.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.com.matheus.oliveira.entidades.Entidade;
import br.com.matheus.oliveira.exceptions.GeradorCodigoException;

public class GeradorCodigoServiceTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private GeradorCodigoService service;
	
	@Before
	public void setup() {
		service = new GeradorCodigoService();
	}
	
	@Test
	public void lancaExcecaoEntidadeSemNome() throws GeradorCodigoException {
		//cenario
		Entidade entidade = new Entidade();
		
		//validacao
		thrown.expect(GeradorCodigoException.class);
		thrown.expectMessage("Não é possível gerar uma classe sem nome");
		
		//acao
		service.gerarClasse(entidade);
	}
	
	@Test
	public void deveGerarClassseSoComNome() throws GeradorCodigoException {
		// cenario
		Entidade entidade = new Entidade();
		entidade.setNome("Teste");
		
		//acao
		String classe = service.gerarClasse(entidade);
		
		//validacao
		String esperado = "class Teste {\n}";
		assertThat(classe, is(esperado));
	}

	public void deveGerarClasseComNomeEPacote() {
		
	}
	
	
}
