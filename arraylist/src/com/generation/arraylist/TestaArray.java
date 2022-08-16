package com.generation.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArray {

	public static void main(String[] args) {
		
		double x = 0.0;
		
		Double y = Double.valueOf(10);
		
		
		ArrayList<Double> notas = new ArrayList<Double>();

		notas.add(y);
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		System.out.println(notas.toString());
		System.out.println("\n A posição da nota 5 é: " + notas.indexOf(5d));
		notas.set(notas.indexOf(5d), 6.0d);
		System.out.println("\n Altera a nota 5 para 6: " + notas);
		notas.remove(notas.indexOf(4.0d));
		System.out.println(notas.toString());
		
		System.out.println(notas.isEmpty());
		
		System.out.println(Collections.max(notas));
		System.out.println(Collections.min(notas));
	}

}
