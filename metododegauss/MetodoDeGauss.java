package metododegauss;
public class MetodoDeGauss {
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do Sistema:");
		int tam = MatrizDeGauss.teclado.nextInt();
		MatrizDeGauss matriz = new MatrizDeGauss(tam);
		matriz.criaMatriz();
	}

}