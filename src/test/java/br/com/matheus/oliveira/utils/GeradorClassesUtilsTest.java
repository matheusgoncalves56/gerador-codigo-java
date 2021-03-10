package br.com.matheus.oliveira.utils;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GeradorClassesUtilsTest {

	@Test
	public void testaGerarPacote() {
		//cenario
		String packageName = "br.com.matheus";
		
		//acao
		String packageGerado = GeradorClassesUtils.gerarPackage(packageName);
		
		//Resultado
		String packageEsperado = "package br.com.matheus\n\n";
		assertThat(packageGerado, is(equalTo(packageEsperado)));
	}
}
