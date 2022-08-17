package com.generation.trabalhador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.trabalhador.model.Gerente;
import com.generation.trabalhador.model.Trabalhador;
import com.generation.trabalhador.model.Vendedor;

public class TestaTrabalhador {

	static List<Trabalhador> listTrabalhador = new ArrayList<Trabalhador>();
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		long id = 0L;
		float salario = 0f;
		int setor, numero = 0;
		String nome = "";
		
		System.out.println("\nCadastrar Gerente\n");
		
		System.out.println("\nDigite o Id: ");
		id = leia.nextLong();
		System.out.println("\nDigite o Nome: ");
		nome = leia.next();
		System.out.println("\nDigite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o setor: ");
		setor = leia.nextInt();
		
		Gerente g1 = new Gerente(id, nome, salario, setor);
		
		listTrabalhador.add(g1);
		listTrabalhador.get(procurar(g1.getId())).visualizar();
		listTrabalhador.get(procurar(g1.getId())).aumentarSalario(10);
		
		System.out.println("\nCadastrar Vendedor\n");
		
		System.out.println("\nDigite o Id: ");
		id = leia.nextLong();
		System.out.println("\nDigite o Nome: ");
		nome = leia.next();
		System.out.println("\nDigite o Salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o Numero do vendedor: ");
		numero = leia.nextInt();
		
		Vendedor v1 = new Vendedor(id, nome, salario, numero);
		
		listTrabalhador.add(v1);
		listTrabalhador.get(procurar(v1.getId())).visualizar();
		listTrabalhador.get(procurar(v1.getId())).aumentarSalario(10);
	}
	
	public static int procurar(Long id) {
		
		for(int contador=0; contador < listTrabalhador.size(); contador++) {
			if((listTrabalhador.get(contador)).getId() == id)
				return contador;
		}
		return -1;
	}

}
