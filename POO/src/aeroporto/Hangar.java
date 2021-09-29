package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "Branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = false;
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		boeing777.aterrizar();
		Aviao lear25 = new Aviao();
		lear25.ano = 1970;
		lear25.cor = "Azul";
		lear25.envergadura = 43.5;
		System.out.println("Ano: " + lear25.ano);
		System.out.println("Cor: " + lear25.cor);
		System.out.println("Envergadura: " + lear25.envergadura);
		lear25.ligar();
		lear25.acelerar();
		lear25.aterrizar();
		if (boeing777.tremPouso == true)
			boeing777.aterrizar();
		else
			System.out.print("ARREMETER!");

	}

}
