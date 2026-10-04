package business;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}
	
	public String latir() {
		return "miau... miau...";
	}
	
	@Override
	public String brincar() {
		return super.brincar() + " com seu arranhador.";
	}

}
