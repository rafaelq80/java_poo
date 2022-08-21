package com.generation.trabalhador.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Vendedor extends Trabalhador {

	private int numero;

	public Vendedor(Long id, String nome, BigDecimal salario, int numero) {
		super(id, nome, salario);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public void aumentarSalario(float percentual) {

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		BigDecimal aumento = new BigDecimal(percentual / 100);
		aumento = aumento.multiply(this.salario);

		this.setSalario(this.getSalario().add(aumento));
		System.out.println("\nNovo Salário: " + df.format(salario));
	}

	public void visualizar() {

		super.visualizar();
		System.out.println("\nNumero do Vendedor: " + this.getNumero());

	}

}
