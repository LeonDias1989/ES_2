import javax.swing.JOptionPane;

public class BinomioEntidade {

	private int n, k, coeficiente;

	public BinomioEntidade(int n, int k) {
		super();
		this.n = n;
		this.k = k;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getCoeficiente() {
		int result = 0;
		try {

			result = fatorial(n) / (fatorial(k) * fatorial(n - k));

		} catch (ArithmeticException a) {
			JOptionPane.showMessageDialog(null, "Erro\nExceção Aritmética",
					"Erro", JOptionPane.ERROR_MESSAGE);
		}
		return result;

	}

	private int fatorial(int i) {
		if (i <= 1)
			return 1;

		return fatorial(i - 1) * i;

	}

	@Override
	public String toString() {
		return "" + coeficiente;
	}

}
