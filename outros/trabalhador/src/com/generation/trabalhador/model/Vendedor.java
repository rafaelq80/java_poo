package com.generation.trabalhador.model;

public class Vendedor extends Trabalhador {

	private int numero;

	public Vendedor(Long id, String nome, float salario, int numero) {
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

		salario *= 1 + (percentual) / 100;
		System.out.println("\nNovo Salário: " + salario);
	}

	public void visualizar() {

		super.visualizar();
		System.out.println("\nNumero do Vendedor: " + this.getNumero());

	}

}
