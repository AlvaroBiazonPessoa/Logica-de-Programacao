package equacoes_matematicas;

public class ObjetoComposto {
	double n1, n2;
	public ObjetoComposto(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "[x1: " + n1 + ", x2: " + n2 + "]";
	}
}
