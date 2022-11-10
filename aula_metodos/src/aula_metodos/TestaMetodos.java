package aula_metodos;

import static aula_metodos.pacote1.ClassePacote1.*;

public class TestaMetodos {

	public static void main(String[] args) {


//	        Chamadas dos Métodos criados na Classe TestaMétodos
	        metodoPublico();
	        metodoFriendly();
	        metodoProtegido();
	        metodoPrivado();

//	        Chamadas dos Métodos criados na Classe Classe1
	        Classe1.metodoPublico1();
	        Classe1.metodoFriendly1();
	        Classe1.metodoProtegido1();
	        //Classe1.metodoPrivado1(); // Erro!
	        
//	        Chamadas dos Métodos criados na Classe ClassePacote1
	        metodoPublicoPacote1();
	        //metodoFriendlyPacote1(); // Erro!
	        //metodoProtegidoPacote1(); // Erro!
	        //metodoPrivadoPacote1(); // Erro!
	        
	}

	public static void metodoPublico(){
        System.out.println("Método Público");
    }

    static void metodoFriendly(){
        System.out.println("Método Friendly");
    }

    protected static void metodoProtegido(){
        System.out.println("Método Protegido");
    }

    private static void metodoPrivado(){
        System.out.println("Método Privado");
    }
    
}
