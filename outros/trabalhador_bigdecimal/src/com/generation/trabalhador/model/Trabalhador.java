package com.generation.trabalhador.model;

import java.math.BigDecimal;

public abstract class Trabalhador {

	private Long id;
	private String nome;
	protected BigDecimal salario;
	
	public Trabalhador(Long id, String nome, BigDecimal salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public abstract void aumentarSalario(float percentual);
	
	public void visualizar() {
		System.out.println("\nId do trabalhador: " + this.getId());
		System.out.println("\nNome do trabalhador: " + this.getNome());
		System.out.println("\nSalário do trabalhador: " + this.getSalario());
		
	}
	
	
}
