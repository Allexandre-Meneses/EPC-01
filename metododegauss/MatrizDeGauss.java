package metododegauss;

public class MatrizDeGauss {

    
	int tamanho;
	

	public MatrizDeGauss(int tamanho){
		this.tamanho = tamanho;

	}

	public void criaMatriz() {
		double[][] matrizGauss = new double[this.tamanho][this.tamanho + 1];
		for (int linha = 0; linha < this.tamanho; linha++) { 
			for (int coluna = 0; coluna <= tamanho; coluna++) {
				System.out.print("Digite o Elemento da posição [" + (linha+1) + ", " + (coluna+1) + "]: ");
				matrizGauss[linha][coluna] = MetodoDeGauss.teclado.nextDouble();
			}
		}

		System.out.println("\n Matriz Original ");
		imprimeMatriz(matrizGauss);

		System.out.println("\n Matriz de Gauss ");
        eliminaProgressiva(matrizGauss);
		imprimeMatriz(matrizGauss);

	}

	public void imprimeMatriz(double matriz[][]) {
		System.out.println("|");
		for (int linha = 0; linha < this.tamanho; linha++) {
			for (int coluna = 0; coluna <= tamanho; coluna++) {
				System.out.printf("|%.3f\t", matriz[linha][coluna]);
			}
			System.out.println("|");
		}
	}

	public void eliminaProgressiva(double matriz[][]) {
		double fator;
		for (int k = 0; k < this.tamanho - 1; k++) {
			for (int i = (k + 1); i < this.tamanho; i++) {
				fator = matriz[i][k] / matriz[k][k];
				for (int j = 0; j <= this.tamanho; j++) {
					matriz[i][j] = matriz[i][j] - fator * matriz[k][j];
				}
			}
		}

	}

}
