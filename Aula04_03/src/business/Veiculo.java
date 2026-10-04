package business;

public abstract class Veiculo {

	protected final int VELOCIDADE_MAXIMA = 180;
	protected final int VELOCIDADE_MINIMA = 0;
	
	private String modelo, fabricante;
	private int ano;
	protected int velocidadeAtual;
	
	private Motor motor;
	private Manutencao manutencao;
	
	public String getModelo() { return modelo; }
	public String getFabricante() { return fabricante; }
	public int getAno() { return ano; }
	public int getVelocidadeAtual() { return velocidadeAtual; }
	
  	// esse "get", para o exercício atual estaria relativamente redudante
	// public Motor getMotor() { return this.motor; } 

	public Manutencao getManutencao() { return manutencao; }
	public void setManutencao(Manutencao manutencao) { this.manutencao = manutencao; } 
		
	public Veiculo(String modelo, String fabricante, int ano, int potencia, String tipo) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
		this.velocidadeAtual = 0;
		
		this.motor = new Motor(potencia, tipo);		
	}

	public void acelerar() {
		velocidadeAtual += 5;
		controlarVelocidadeMaxima();
	}
	
	public void desacelerar() {
		velocidadeAtual -= 5;
		controlarVelocidadeMinima();
	}

	public void parar() {
		velocidadeAtual = 0;
	}

	@Override
	public String toString() {
		return String.format("Veiculo: %s; velocidade atual: %d km/h; ", modelo, velocidadeAtual)
				+ motor + 
				((manutencao == null) ? "" : manutencao.toString());
	}

	protected void controlarVelocidadeMaxima() {
		if (velocidadeAtual > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
	}
	
	protected void controlarVelocidadeMinima() {
		if (velocidadeAtual < VELOCIDADE_MINIMA)
			velocidadeAtual = VELOCIDADE_MINIMA;
	}
	
}

