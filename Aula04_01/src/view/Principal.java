package view;

import negocio.CamaraTermica;

public class Principal {

	public static void main(String[] args) {
		// instancia objeto "camaraFria", cujos atributos são formados
		// por elementos do tipo "Temperatura"
		CamaraTermica camaraFria = new CamaraTermica(-5, -1);
		
		// exibe a faixa de operação em graus Celsius...
		System.out.println(String.format(
			"[Câmara fria] Faixa de operação entre %.2f ºC e %.2f ºC", 
				camaraFria.getTemperaturaMinima().getGrausCelsius(),
				camaraFria.getTemperaturaMaxima().getGrausCelsius()));
		
		// ...e em graus Fahrenheit
		System.out.println(String.format(
				"[Câmara fria] Faixa de operação entre %.2f ºF e %.2f ºF", 
					camaraFria.getTemperaturaMinima().getGrausFahrenheit(),
					camaraFria.getTemperaturaMaxima().getGrausFahrenheit()));
	}

}
