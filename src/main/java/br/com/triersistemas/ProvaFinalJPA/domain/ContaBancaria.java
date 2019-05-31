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
public class ContaBancaria { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contaBancaria_gen")
	@SequenceGenerator(name = "contaBancaria_gen", sequenceName = "conta_bancaria_id_seq", allocationSize = -1)
	private Integer id; 
	
	private String numeroContaBancaria;
	
	private BigDecimal saldo;
	
	private BigDecimal limiteChequeEspecial; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "correntista_id", referencedColumnName = "id")
	private Correntista correntista;  
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "gerente_id", referencedColumnName = "id")
	private Gerente gerente; 
	
}