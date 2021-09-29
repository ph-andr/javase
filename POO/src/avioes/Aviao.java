package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	
	/**
	 * aterrizar
	 */
	public void aterrizar() {
		System.out.println("Avião pousou ___________________");
	}
	
	/**
	 * decolou
	 */
	public void acelerar() {
		System.out.println("Avião decolou _______ -------");
	}
}
