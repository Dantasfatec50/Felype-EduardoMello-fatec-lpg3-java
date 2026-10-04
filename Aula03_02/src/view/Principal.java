package view;

import business.Figura;
import business.Quadrado;

public class Principal {

	public static void main(String[] args) {
		// *** UPCASTING ***
		Quadrado quadradoUp = new Quadrado();
		quadradoUp.setLado(5);

		// ...
		// comentários apenas para simbolizar que alguma regra de 
		// negócio trazem a necessidade de realização de upcasting
		// ...
		
		// via atribuição direta (casting implícito), atribui instância 
		// de objeto da classe filha para criar objeto da classe pai
		Figura figuraUp = quadradoUp;
		System.out.println(String.format("[UpCasting] "
				+ "Área da figura: %.2f cm²", figuraUp.calcularArea()));
		
		
		// *** DOWNCASTING ***
		Figura figuraDown = new Quadrado();
		
		// ...
		// comentários apenas para simbolizar que alguma regra de 
		// negócio trazem a necessidade de realização de downcasting
		// ...

		// via atribuição indireta (casting explícito), atribui instância 
		// de objeto da classe pai para criar objeto da classe filha
		Quadrado quadradoDown = (Quadrado)figuraDown;
		quadradoDown.setLado(7);
		System.out.println(String.format("[DownCasting] "
				+ "Área da quadrado: %.2f cm²", quadradoDown.calcularArea()));

	}

}







