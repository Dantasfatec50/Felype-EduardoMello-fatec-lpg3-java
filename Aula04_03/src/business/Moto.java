package business;

public class Moto extends Veiculo {

	private boolean descansoAcionado;
	
	public boolean isDescansoAcionado() { return this.descansoAcionado; } 
	
	public Moto(String modelo, String fabricante, int ano, int potencia, String tipo) {
		super(modelo, fabricante, ano, potencia, tipo);
	}

	@Override
	public void acelerar() {
		super.acelerar();
		descansoAcionado = false;
	}

	@Override
	public void desacelerar() {
		super.desacelerar();

		// com atribuição direta em razão do teste lógico
		descansoAcionado = (velocidadeAtual == 0);
	}

	@Override
	public void parar() {
		super.parar();
		descansoAcionado = true;
	}

	@Override
	public String toString() {
		return super.toString() + "; descanso acionado: " + descansoAcionado;
	}
	
	

}
