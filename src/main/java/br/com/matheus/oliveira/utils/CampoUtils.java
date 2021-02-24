package br.com.matheus.oliveira.utils;

import java.util.List;

import br.com.matheus.oliveira.entidades.Campo;
import br.com.matheus.oliveira.enums.Tipo;

public class CampoUtils {

	public static boolean possuiCampoList(List<Campo> campos) {
		if(campos != null) {
			return campos.stream().anyMatch(c -> c.getTipo() == Tipo.LIST);
		}
		
		return false;
	}
}
