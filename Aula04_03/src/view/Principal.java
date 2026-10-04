package view;

import java.util.Scanner;

import business.Carro;
import business.Manutencao;
import business.Moto;
import business.Veiculo;

public class Principal {

	public static void main(String[] args) {

		System.out.println("*** Locadora com OOP ***");
		
		System.out.print("Escolha um tipo veículo: \n1 - Carro\n2 - Moto");
		
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		
		// declara objeto do tipo "Veiculo"
		Veiculo veiculo = null;
		
		System.out.print("Informe o modelo: ");
		String modelo = entrada.next();
		System.out.print("Informe o fabricante: ");
		String fabricante = entrada.next();
		System.out.print("Informe o ano: ");
		int anoFabricacao = entrada.nextInt();
		
		System.out.print("Potência do motor: ");
		int potenciaMotor = entrada.nextInt();
		System.out.print("Tipo do motor: ");
		String tipoMotor = entrada.next();		
		
		switch(opcao) {
			case 1: 
				System.out.print("Informe a quantidade de portas: ");
				int qtdePortas = entrada.nextInt();
				veiculo = new Carro(modelo, fabricante, anoFabricacao, qtdePortas, potenciaMotor, tipoMotor); 
				break;
			case 2: veiculo = new Moto(modelo, fabricante, anoFabricacao, potenciaMotor, tipoMotor); break;
			default: System.out.println("Veículo indisponível");
		}
		
		for (int i = 0; i < 5; i++) {
			veiculo.acelerar();
			System.out.println(veiculo);
		}
		
		for (int i = 0; i < 5; i++) {
			veiculo.desacelerar();
			System.out.println(veiculo);
		}

		System.out.print("Deseja fazer a manutenção do veículo? (S/N)");
		String temManutencao = entrada.next();
		
		if (temManutencao.equalsIgnoreCase("S")) {
			System.out.print("Data da manutenção (dd/mm/aaaa): ");
			String dataUltimaManutencao = entrada.next();
			System.out.print("Tipo de serviço: ");
			String tipoServico = entrada.next();
			
			Manutencao ultimaManutencao = new Manutencao(dataUltimaManutencao, tipoServico);
			veiculo.setManutencao(ultimaManutencao);
		}
		
		veiculo.acelerar();
		System.out.println(veiculo);
		
	}

}
