package view;

import business.GeradorPin;
import business.GeradorSenhaForte;
import business.IGeradorSenha;

public class Principal {

    public static void main(String[] args) {
    	// Data:10/09/2026
        String aluno1 = "Felype Silveira Dantas";
        String aluno2 = "Edu Mello Moura Brasilico";

        System.out.println("Alunos: " + aluno1 + " e " + aluno2);
   

        IGeradorSenha gerador;

        gerador = new GeradorSenhaForte(12);
        System.out.println("Senha forte: " + gerador.gerarSenha());
        System.out.println("Senha forte: " + gerador.gerarSenha());

        gerador = new GeradorPin();
        System.out.println("PIN: " + gerador.gerarSenha());
        System.out.println("PIN: " + gerador.gerarSenha());
    }
}
