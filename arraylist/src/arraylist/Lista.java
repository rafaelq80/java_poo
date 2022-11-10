package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double d = 9.0;
		//double numero = 0.0;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(3.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(d);
		
		/*System.out.println("\nDigite um numero: ");
		numero = leia.nextDouble();
		notas.add(numero);*/
		
		System.out.println("\nDados da Collection Notas: " + notas);

		System.out.println("\nPosição da Nota 4.0: " + notas.indexOf(4.0));
			
				
		System.out.println("\nExiste a Nota 4.0? " + notas.contains(4.0));
		
		notas.remove(4.0);
		
		for(var nota : notas) {
			System.out.println(nota);
		}
		
		for(int i=0; i < notas.size(); i++) {
			System.out.println(notas.get(i));
		}
		
		System.out.println("\nLista está vazia? " + notas.isEmpty());
		
		notas.forEach(System.out::println);
	}

}
