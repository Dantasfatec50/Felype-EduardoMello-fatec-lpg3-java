package business;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}
	
	public String latir() {
		return "au-au!!";
	}
	
	@Override
	public String brincar() {
		return super.brincar() + " com seu osso.";
	}

}
