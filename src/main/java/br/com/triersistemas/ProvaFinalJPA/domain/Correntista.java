package br.com.triersistemas.ProvaFinalJPA.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Correntista { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "correntista_gen")
	@SequenceGenerator(name = "correntista_gen", sequenceName = "correntista_id_seq", allocationSize = -1)
	private Integer id;  
	
	private String nome; 
	
	private String endereco; 
	
	private LocalDate correntistaDesde; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "grupo_correntista_id", referencedColumnName = "id")
	private GrupoCorrentista grupoCorrentista; 
	

}
