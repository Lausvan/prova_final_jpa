package br.com.triersistemas.ProvaFinalJPA.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.triersistemas.ProvaFinalJPA.model.ContagemCorrentistas;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContaBancariaRepositoryTest { 
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	//Questao 2
	
//	  @Test public void numeroDeCorrentistasPorGerenteTest() {
//	  
//	  List<CorrentistasPorGerenteModel> contas=
//	  contaBancariaRepository.selecionaCorrentistasPorGerentes();
//	  
//	  for (CorrentistasPorGerenteModel correntistasPorGerenteModel : contas) {
//	  System.out.println(correntistasPorGerenteModel); }
//	  
//	  
//	  
//	  }
	  
	//Questao 3
	@Test public void contagemDeCorrentistasCadastrados() {
		ContagemCorrentistas correntista = contaBancariaRepository.contagemCorrentistas();
		
			System.out.println(correntista); 
			
			Assertions.assertThat(correntista.getCorrentistas()).isEqualTo(5);
	} 
	

}
