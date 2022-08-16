package com.generation.triatleta;

public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista{

	public Triatleta(String nome) {
		super(nome);
		
	}

	@Override
	public void aquecer() {
		System.out.println("\nAquecendo...");
		
	}

	@Override
	public void correrDeBicicleta() {
		System.out.println("\nCorrendo de Bike...");
		
	}

	@Override
	public void correr() {
		System.out.println("\nCorrendo...");
		
	}

	@Override
	public void nadar() {
		System.out.println("\nNadando...");
		
	}

}
