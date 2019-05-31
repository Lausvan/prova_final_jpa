package br.com.triersistemas.ProvaFinalJPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Gerente {  
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gerente_gen")
	@SequenceGenerator(name = "gerente_gen", sequenceName = "gerente_id_seq", allocationSize = -1)
	private Integer id;  
	
	private String nome;

}
