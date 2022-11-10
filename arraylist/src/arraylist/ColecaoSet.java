package arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(3.0);
		notas.add(6.0);
		notas.add(10.0);
		
		System.out.println("\nDados da Collection Notas: " + notas);
		
		System.out.println("\nExiste a Nota 4.0? " + notas.contains(4.0));
		
		notas.remove(4.0);
		
		for(var nota : notas) {
			System.out.println(nota);
		}

		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
	}

}
