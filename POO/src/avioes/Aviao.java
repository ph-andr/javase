package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	
	/**
	 * aterrizar
	 */
	public void aterrizar() {
		System.out.println("Avi�o pousou ___________________");
	}
	
	/**
	 * decolou
	 */
	public void acelerar() {
		System.out.println("Avi�o decolou _______ -------");
	}
}
