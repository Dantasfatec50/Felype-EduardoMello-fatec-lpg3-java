package view;

import java.util.Scanner;

import model.Adicao;
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
		
		switch(tipoOperacao) {
			case 1: 
				Adicao adicao = new Adicao(v1, v2);
				adicao.calcular();
				resultado = adicao.getResultado();
				System.out.println(String.format("Resultado: %.2f", resultado));
				break;
			case 2: 
				Subtracao subtr = new Subtracao(v1, v2);
				subtr.calcular();
				resultado = subtr.getResultado();
				System.out.println(String.format("Resultado: %.2f", resultado));
				break;
			case 3: 
				Multiplicacao multi = new Multiplicacao(v1, v2);
				multi.calcular();
				resultado = multi.getResultado();
				System.out.println(String.format("Resultado: %.2f", resultado));
				break;
			case 4: 
				Divisao div = new Divisao(v1, v2);
				div.calcular();
				resultado = div.getResultado();
				System.out.println(String.format("Resultado: %.2f", resultado));
				break;
			default: 
				System.out.println("Operação não suportada.");
				
		}
		
	}

}





