package gausspivotamentoparcial;

import java.util.Scanner;

public class GausPivotementoParcial {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o tamanho da equação");
		int tam = GausPivotementoParcial.teclado.nextInt(); 

		EliminacaoGauss pivo = new EliminacaoGauss(tam);

        pivo.criaMatriz();

    }
}