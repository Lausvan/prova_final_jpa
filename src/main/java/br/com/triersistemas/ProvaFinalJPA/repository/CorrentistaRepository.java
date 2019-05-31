package br.com.triersistemas.ProvaFinalJPA.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.Correntista;

@Repository
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{ 
	
	//Questao 6
	@Query("SELECT correntistaDesde from Correntista c ORDER BY c.correntistaDesde ASC")
	List<LocalDate> findByDesdeCorrentistas(); 
	
	//Questao 7
	List<Correntista> findByEnderecoStartingWithIgnoreCase(String prefixo);

}
