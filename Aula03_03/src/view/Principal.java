package view;

import java.util.Scanner;

import model.Adicao;
import model.Calculo;
import model.Multiplicacao;
import model.Subtracao;
import model.Divisao;

public class Principal {

	public static void main(String[] args) {

		System.out.println("*** Calculadora com POO ***");
		// instancia objeto para receber valores do usuário
		Scanner entrada = new Scanner(System.in);
		// solicita valores para cálculo
		System.out.print("Informe o valor 1: ");
		float v1 = entrada.nextFloat();
		System.out.print("Informe o valor 2: ");
		float v2 = entrada.nextFloat();

		System.out.println("Escolha a operação desejada: \n" +
				"1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
		int tipoOperacao = entrada.nextInt();

		float resultado = 0;
		
		// declara objeto da classe pai
		Calculo calc = null;
		
		// instancia classe filha de acordo com seleção do usuário e 
		// atribui ao objeto da classe pai (upcasting)
		switch(tipoOperacao) {
			case 1: calc = new Adicao(v1, v2); break;
			case 2: calc = new Subtracao(v1, v2); break;
			case 3: calc = new Multiplicacao(v1, v2); break;
			case 4: calc = new Divisao(v1, v2); break;
			default: System.out.println("Operação não suportada.");
				
		}
		// executa a regra de negócio
		calc.calcular();
		// exibe resultado
		System.out.println(String.format("Resultado: %.2f", calc.getResultado()));
		
	}

}





