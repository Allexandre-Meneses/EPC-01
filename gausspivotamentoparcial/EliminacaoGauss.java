package gausspivotamentoparcial;

public class EliminacaoGauss {
    private Integer tamanho = 2;

    EliminacaoGauss(int tam) {
		this.tamanho = tam;
	}

	public void criaMatriz() {

		double[][] x = new double[this.tamanho][this.tamanho ];
		double[] y = new double[this.tamanho];

		for (int linha = 0; linha < this.tamanho; linha++) { 
			for (int coluna = 0; coluna < tamanho; coluna++) {
				System.out.print("Digite o Elemento da posição [" + (linha+1) + ", " + (coluna+1) + "]: ");
				x[linha][coluna] = GausPivotementoParcial.teclado.nextDouble();
			}
			System.out.println("Digite o Resultado da linha 1");
			y[linha] = GausPivotementoParcial.teclado.nextDouble();
		}

		System.out.println("Matriz Original");
		imprimeMatriz(x, y);
		System.out.println("Matriz de Gauss com pivotamento parcial.");
		eliminacaoDeGauss(x, y);
		imprimeMatriz(x, y);
	
		
	}

	public void eliminacaoDeGauss(double x[][], double[] y) {

		for (int k = 0; k < (tamanho - 1); k++) {
			for (int i = (k + 1); i < tamanho; i++) {
				if (Math.abs(x[k][k]) < Math.abs(x[i][k])) {
					alteraLinha(k, i, x, y);
				}
				double fator = x[i][k] / x[k][k];
				x[i][k] = (double) 0;

				for (int j = (k + 1); j < tamanho; j++) {
					x[i][j] = x[i][j] - fator * x[k][j];
				}

				y[i] = y[i] - fator * y[k];
			}
		}

	}

	private void alteraLinha(int linha1, int linha2, double[][] x, double[] y) {
		double aux = 0.00;

		for (int i = 0; i < tamanho; i++) {
			aux = x[linha1][i];
			x[linha1][i] = x[linha2][i];
			x[linha2][i] = aux;
		}

		aux = y[linha1];
		y[linha1] = y[linha2];
		y[linha2] = aux;

	}



	public void imprimeMatriz(double[][] x, double[] y) {
		System.out.println("");

		for (int linha = 0; linha < tamanho; linha++) {
			for (int coluna = 0; coluna < tamanho; coluna++) {
				System.out.printf("|%.3f ", x[linha][coluna]);
			}
			System.out.printf(" |%.3f", y[linha]);
			System.out.print("\n");
		}
		System.out.println("");

	}

}
