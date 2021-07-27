package gaussseidel;

public class MetodoGaussSeidel {
    
    protected double x0, y0, z0, x1, y1, z1, erro, erro1, erro2, erro3;
	protected int cont = 1;

	private double x01(double x0, double y0, double z0) {
		return (8 - (2 * y0 - z0)) / 3;
	}

	private double x02(double x0, double y0, double z0) {
		return (-4 - (2 * x0 + 2 * z0)) / -4;
	}

	private double x03(double x0, double y0, double z0) {
		return (3 - (-x0 + y0)) / 5;
	}

    public MetodoGaussSeidel(double x0, double y0, double z0, double erro) {
		this.x0 = x0;
		this.y0 = y0;
		this.z0 = z0;
		this.erro = erro;
	}

	public void gaussSeidel() {
		System.out.printf("\nIteracao   x\t    y\t   z\n");

		System.out.printf("\n%d\t|%.4f\t|%.4f\t|%.4f\n", 0, this.x0, this.y0, this.z0);

		do {
			this.x1 = x01(this.x0, this.y0, this.z0);
			this.y1 = x02(this.x1, this.y0, this.z0);
			this.z1 = x03(this.x1, this.y1, this.z0);

			System.out.printf("%d\t|%.4f\t|%.4f\t|%.4f\n", cont, x1, y1, z1);

			this.erro1 = Math.abs(this.x0 - x1);
			this.erro2 = Math.abs(this.y0 - y1);
			this.erro3 = Math.abs(this.z0 - z1);

			cont++; 

			this.x0 = this.x1;
			this.y0 = this.y1;
			this.z0 = this.z1;

		} while (this.erro1 > this.erro && this.erro2 > this.erro && this.erro3 > this.erro);

	}

	public void printSolucao() {
		System.out.printf("\nResultado: \n x = %.3f\n y = %.3f \n z = %.3f\n", this.x1, this.y1, this.z1);
	}

    
}
