package br.com.triersistemas.ProvaFinalJPA.model;

import java.math.BigDecimal;

import br.com.triersistemas.ProvaFinalJPA.domain.GrupoCorrentista;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SomaDeSaldoPorGrupo {
	
	private GrupoCorrentista grupo;
	
	private BigDecimal valor;

}
