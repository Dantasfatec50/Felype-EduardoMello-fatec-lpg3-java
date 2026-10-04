package view;

import model.Aluno;
import model.Professor;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Bruno", "bruno@fatecrl", 123);
		System.out.println(aluno1.entrarNaSala());

		Professor prof1 = new Professor("Rubens", "rubens@lara");
		System.out.println(prof1.entrarNaSala());
		
		Professor prof2 = new Professor("Lara", "lara@rubens");
		System.out.println(prof2.entrarNaSala("Dr."));
		
//		Pessoa pessoa1 = new Pessoa("Pessoa qualquer", "tanto faz");
//		System.out.println(pessoa1.entrarNaSala());
		
	}
}
