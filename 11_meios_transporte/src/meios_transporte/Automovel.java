package meios_transporte;

public class Automovel extends Terrestre {

	private String cor;
	private int numeroPortas;
	private String placa;
	private int marcha;

	public Automovel(int capacidade, int numeroRodas, float velocidade, String cor, int numeroPortas, String placa,
			int marcha) {
		super(capacidade, numeroRodas, velocidade);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.marcha = marcha;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	@Override
	public void visualiza() {

		super.visualiza();
		System.out.println("cor: " + this.cor);
		System.out.println("Número de portas: " + this.numeroPortas);
		System.out.println("Placa: " + this.placa);
		System.out.println("Marcha: " + this.marcha);

	}
}
