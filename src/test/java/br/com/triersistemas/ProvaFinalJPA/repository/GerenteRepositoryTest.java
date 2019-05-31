package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GerenteRepositoryTest { 
	
	@Autowired
	private GerenteRepository gerenteRepository;
	
	//Questao4
	@Test
	public void buscaGerente() {
		List<Gerente> gerentes = gerenteRepository.findByNomeStartingWithIgnoreCase("vir");
		Assertions.assertThat(gerentes.get(0).getNome()).isEqualTo("Virgulino");
	}

}
