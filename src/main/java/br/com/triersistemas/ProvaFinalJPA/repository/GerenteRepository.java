package br.com.triersistemas.ProvaFinalJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer>{ 
	
	List<Gerente> findByNomeStartingWithIgnoreCase(String prefixo);

}
