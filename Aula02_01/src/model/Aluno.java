package model;

public class Aluno extends Pessoa {

	private int ra;
	
	public int getRA() { return ra; }

	public Aluno(String nome, String email, int ra) {
		super(nome, email);
		this.ra = ra;
	}
}
