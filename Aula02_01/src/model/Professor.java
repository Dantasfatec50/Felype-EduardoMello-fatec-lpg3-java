package model;

public class Professor extends Pessoa {

	public Professor(String nome, String email) {
		super(nome, email);
	}

	@Override
	public String entrarNaSala() {
		// return super.entrarNaSala() + " Sou o professor da aula de hoje.";
		return String.format("Olá, sou o Profº %s.", nome);
	}
	
	public String entrarNaSala(String tratamento) {
		return String.format("Olá, sou o Profº %s %s.", tratamento, nome);
	}
	
}
