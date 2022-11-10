package aula_metodos;

public class Classe1 {

	public static void metodoPublico1(){
        System.out.println("Método Público da Classe 01");
    }

    static void metodoFriendly1(){
        System.out.println("Método Friendly da Classe 01");
    }

    protected static void metodoProtegido1(){
        System.out.println("Método Protegido da Classe 01");
    }

	@SuppressWarnings("unused")
	private static void metodoPrivado1(){
        System.out.println("Método Privado da Classe 01");
    }
    
}
