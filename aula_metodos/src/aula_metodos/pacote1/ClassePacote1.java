package aula_metodos.pacote1;

public class ClassePacote1 {

	public static void metodoPublicoPacote1(){
        System.out.println("Método Público da Classe ClassePacote1");
    }

    static void metodoFriendlyPacote1(){
        System.out.println("Método Friendly da Classe ClassePacote1");
    }

    protected static void metodoProtegidoPacote1(){
        System.out.println("Método Protegido da Classe ClassePacote1");
    }

    @SuppressWarnings("unused")
	private static void metodoPrivadoPacote1(){
        System.out.println("Método Privado da Classe ClassePacote1");
    }
    
}
