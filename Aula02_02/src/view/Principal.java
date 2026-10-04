package view;

import business.Cachorro;
import business.Gato;

public class Principal {

	public static void main(String[] args) {

		Cachorro cao1 = new Cachorro("Totó");
		System.out.println(cao1.latir());
		System.out.println(cao1.brincar());
		
		Gato gato1 = new Gato("Tom");
		System.out.println(gato1.latir());
		System.out.println(gato1.brincar());
		
	}

}
