package view;

import business.*;

public class Principal {
	
	public static void main (String[] args) {
		
		// instancia professor
        Professor professor = new Professor("Rubens Lara", 123);

        // instancia disciplina
        Disciplina disciplina = new Disciplina("ELE2");
        
        // instancia aula
        Aula aula = new Aula(professor, disciplina);
        
        // inclui alunos presentes (usando "objeto anônimo")
        aula.incluirAluno(new Aluno("Aluno 1", "1001"));
        aula.incluirAluno(new Aluno("Aluno 2", "1002"));
        aula.incluirAluno(new Aluno("Aluno 3", "1003"));
        aula.incluirAluno(new Aluno("Aluno 4", "1004"));
        aula.incluirAluno(new Aluno("Aluno 5", "1005"));

        // define a matéria da aula (usando "objeto anônimo")
        aula.setMateria(new Materia("Revisao OO"));
        
        // exibe informações da aula
        System.out.println(aula);
//        System.out.println(aula.retornarInfo());
	}
		
}
