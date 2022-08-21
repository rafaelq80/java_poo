package com.generation.trabalhador;

import java.math.BigDecimal;
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
		BigDecimal salario = new BigDecimal(0);
		int setor, numero = 0;
		String nome = "";
		
		System.out.println("\nCadastrar Gerente\n");
		
		System.out.println("\nDigite o Id: ");
		id = leia.nextLong();
		System.out.println("\nDigite o Nome: ");
		nome = leia.next();
		System.out.println("\nDigite o Salário: ");
		salario = new BigDecimal(leia.nextFloat());
		System.out.println("\nDigite o setor: ");
		setor = leia.nextInt();
		
		Gerente g1 = new Gerente(id, nome, salario, setor);
		
		/*BigDecimal salarioGerente = new BigDecimal(20000);
		Gerente g1 = new Gerente(1L, "nome", salarioGerente, 1);*/
		
		listTrabalhador.add(g1);
		listTrabalhador.get(procurar(g1.getId())).visualizar();
		listTrabalhador.get(procurar(g1.getId())).aumentarSalario(10);
		
		System.out.println("\nCadastrar Vendedor\n");
		
		System.out.println("\nDigite o Id: ");
		id = leia.nextLong();
		System.out.println("\nDigite o Nome: ");
		nome = leia.next();
		System.out.println("\nDigite o Salário: ");
		salario = new BigDecimal(leia.nextFloat());
		System.out.println("\nDigite o Numero do vendedor: ");
		numero = leia.nextInt();
		
		Vendedor v1 = new Vendedor(id, nome, salario, numero);
		
		/*BigDecimal salario = new BigDecimal(1000);
		Vendedor v1 = new Vendedor(2L, "nome", salario, 1);*/
		
		listTrabalhador.add(v1);
		listTrabalhador.get(procurar(v1.getId())).visualizar();
		listTrabalhador.get(procurar(v1.getId())).aumentarSalario(10);
		
		leia.close();
	}
	
	public static int procurar(Long id) {
		
		for(int contador=0; contador < listTrabalhador.size(); contador++) {
			if((listTrabalhador.get(contador)).getId() == id)
				return contador;
		}
		return -1;
	}

}
