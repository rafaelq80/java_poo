package meios_transporte;

public class Terrestre extends Transporte {

	private int numeroRodas;
	private float velocidade;

	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade);
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public void visualiza() {

		super.visualiza();
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade);

	}
}
