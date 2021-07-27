package metododegauss;

import java.util.Scanner;

public class MetodoDeGauss {

	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do Sistema:");
		int tam = teclado.nextInt();
		MatrizDeGauss matriz = new MatrizDeGauss(tam);
		matriz.criaMatriz();
		teclado.close();
	}

}