package equacoes_matematicas;
import java.lang.Math;

public class SegundoGrau {
	public static ObjetoComposto equacaoSegundoGrau(int a, int b, int c) {
		int delta = b*b - 4*a*c;
		double raizQuadradaDelta = Math.sqrt(delta);
		double x1 = (-b+raizQuadradaDelta) / (2*a);
		double x2 = (-b-raizQuadradaDelta) / (2*a);
		ObjetoComposto ob = new ObjetoComposto(x1, x2);
		return ob;
	}
	public static void main(String[] args) {
		equacaoSegundoGrau(1, 2, -15);
	}
}
