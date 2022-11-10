package com.generation.trabalhador.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Gerente extends Trabalhador{

	private int setor;

	public Gerente(Long id, String nome, BigDecimal salario, int setor) {
		super(id, nome, salario);
		this.setor = setor;
	}
	
	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	@Override
	public void aumentarSalario(float percentual) {
		
		float bonus = 10;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		BigDecimal aumento = new BigDecimal((percentual + bonus) / 100);
		aumento = aumento.multiply(this.salario);
		
		this.setSalario(this.getSalario().add(aumento));
		System.out.println("\nNovo Salário: " + df.format(salario));
		
	}

	public void visualizar() {
		
		super.visualizar();
		System.out.println("\nSetor do Gerente: " + this.getSetor());
		
	}
	
	
}
