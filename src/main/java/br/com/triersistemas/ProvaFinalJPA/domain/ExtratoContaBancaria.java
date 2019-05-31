package br.com.triersistemas.ProvaFinalJPA.domain;

import java.math.BigDecimal;

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
public class ExtratoContaBancaria { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "extratoContaBancaria_gen")
	@SequenceGenerator(name = "extratoContaBancaria_gen", sequenceName = "extrato_conta_bancaria_id_seq", allocationSize = -1)
	private Integer id;  
	
	private String tipoOperacao;
	
	private BigDecimal valor; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "conta_bancaria_id", referencedColumnName = "id")
	private ContaBancaria contaBancaria; 

}
