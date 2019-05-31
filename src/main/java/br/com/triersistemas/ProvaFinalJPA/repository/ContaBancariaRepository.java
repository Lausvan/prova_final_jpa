package br.com.triersistemas.ProvaFinalJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.triersistemas.ProvaFinalJPA.domain.ContaBancaria;
import br.com.triersistemas.ProvaFinalJPA.model.ContagemCorrentistas;

@Repository
public interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Integer>{ 
	
	
//	//Questao 2
//	  @Query("SELECT new br.com.triersistemas.ProvaFinalJPA.model.CorrentistasPorGerenteModel (g.id, cont(g) ) from ContaBancaria c join Gerente g") 
//	  List<CorrentistasPorGerenteModel> selecionaCorrentistasPorGerentes();
//	 
	//Questao3
	@Query("SELECT new br.com.triersistemas.ProvaFinalJPA.model.ContagemCorrentistas (count(correntista)) from ContaBancaria")
	ContagemCorrentistas contagemCorrentistas();  
	
//	//Questao 10
//	@Query("SELECT new br.com.triersistemas.ProvaFinalJPA.model.SomaDeSaldoPorGrupo (c, sum(c.saldo)) FROM ContaBancaria c JOIN Correntista co WHERE co.grupoCorrentista = :id GROUP BY GrupoCorrentista.id")
//	SomaDeSaldoPorGrupo SaldoPorGrupo(@Param("id") Integer id); 
	
//	//qUESTAO 9
//	@Query("Select c.correntista FROM ContaBanca c JOIN ExtratoContaBancaria e WHERE e.contaBancaria = c.id ")
//	 List<ContaBancaria> contaBancariaSemMovimentacao();
	
	
}
