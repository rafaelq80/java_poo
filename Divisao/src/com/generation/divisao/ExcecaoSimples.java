package com.generation.divisao;

public class ExcecaoSimples extends Exception {

	/** 
	 * O serialVersionUID serve para rastrear a
	 * compatibilidade de versões serializadas 
	 * das classes.
	*/
	private static final long serialVersionUID = 1L;

	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
		super(mensagem);
	}
}
