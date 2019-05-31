package br.com.triersistemas.ProvaFinalJPA.repository;

import java.time.LocalDate;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CorrentistaRepositoryTest { 
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	//Questao 6
	@Test
	public void correntistaMaisAntigo() {
		List<LocalDate> correntista = correntistaRepository.findByDesdeCorrentistas(); 
		System.out.println(correntista.get(0));
		Assertions.assertThat(correntista.get(0)).isEqualTo("1958-01-08");
		
	}
	
	//Questao 7
	@Test
	public void correntistaPeloEndereco() {
		List<Correntista> correntistas = correntistaRepository.findByEnderecoStartingWithIgnoreCase("Rua dos Caramujos"); 
		System.out.println(correntistas.get(0));
		Assertions.assertThat(correntistas.get(0).getEndereco()).isEqualTo("Rua dos Caramujos");
		Assertions.assertThat(correntistas.size()).isEqualTo(1);
		
	}
	
	
}
