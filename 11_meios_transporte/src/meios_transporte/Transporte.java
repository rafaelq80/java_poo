package meios_transporte;

public class Transporte {

	private int capacidade;

	public Transporte(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void visualiza() {
		
		System.out.println("\n\n*********************************************************************");
		System.out.println("Dados do Meio de Transporte:");
		System.out.println("*********************************************************************");
		System.out.println("Capacidade (número de passageiros: " + this.capacidade);
		
	}
}
