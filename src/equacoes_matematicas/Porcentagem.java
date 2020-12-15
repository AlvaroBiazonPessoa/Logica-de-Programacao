package equacoes_matematicas;

public class Porcentagem {
	public static float calcularPorcentagem(float porcentagem, float numero) {
		return numero*porcentagem/100;
	}
	public static void main(String[] args) {
		calcularPorcentagem(5, 80);
	}
}
