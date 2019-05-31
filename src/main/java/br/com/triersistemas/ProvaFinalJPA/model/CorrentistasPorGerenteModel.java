package br.com.triersistemas.ProvaFinalJPA.model;

import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CorrentistasPorGerenteModel { 
	
	private Gerente gerente;
	private Long quantidadeDeCorrentistas;

}
