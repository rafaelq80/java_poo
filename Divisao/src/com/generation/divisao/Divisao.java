package com.generation.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) throws ExcecaoSimples {
		
		int divisor, dividendo = 0;
		boolean loop = true;
		
		Scanner leia = new Scanner(System.in);

		do {
			try {
				System.out.println("\nDigite o valor do dividendo: ");
				dividendo = leia.nextInt();
				
				System.out.println("\nDigite o valor do divisor: ");
				divisor = leia.nextInt();
				
				dividir(dividendo, divisor);
				
				loop = false;
				
			}catch (ArithmeticException e) {
				//System.err.println("\nExce��o: " + e);
				leia.nextLine();
				System.out.println("\nDigite valores inteiros diferentes de zero!");
			}catch (InputMismatchException e) {
				System.err.println("\nExce��o: " + e);
				leia.nextLine();
				System.out.println("\nDigite valores inteiros!");
			}finally {
				// Executa o M�todo Lan�a Exce��o
				leia.close();
				lancaExcecao(100);
			}
			
		}while (loop);
		
	}
	
	public static void dividir (int dividendo, int divisor) {
		System.out.println("Divis�o = " + (dividendo / divisor));
	}

	//O Throws apenas indica a exce��o que pode ser lan�ada
	public static void lancaExcecao(int numero) throws ExcecaoSimples{
		if (numero > 10)
			//Se o numero enviado for maior que 10 a ExcecaoSimples � lan�ada com o throw
			throw new ExcecaoSimples("Exce��o Simples: Numero menor do que 10!");
	}
}
