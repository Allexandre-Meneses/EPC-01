package motododejacob;

import java.util.Scanner;

public class MetodoDeJacobbi {
    
    static double x0 = 1.0;
	static double y0 = 1.5;
	static double z0 = 2.0;

	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o Valor do erro: ");
		float e = teclado.nextFloat();
		Jacobbi jacobbi = new Jacobbi(x0, y0, z0, e);
		jacobbi.jacobbi();
		jacobbi.printSolucao();
		teclado.close();
	}

    
}
