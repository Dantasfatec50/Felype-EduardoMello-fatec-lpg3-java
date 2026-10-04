package business;

public class Carro extends Veiculo {

	private int qtdePortas;
	
	public int getQuantidadePortas() { return this.qtdePortas; }
	
	public Carro(String modelo, String fabricante, int ano, int qtdePortas, int potencia, String tipo) {
		// chama construtor da superclasse passando os atributos que ele necessita
		super(modelo, fabricante, ano, potencia, tipo);
		this.qtdePortas = qtdePortas;
	}

	@Override
	public void acelerar() {
		velocidadeAtual += 10;
		super.controlarVelocidadeMaxima();
	}

}
