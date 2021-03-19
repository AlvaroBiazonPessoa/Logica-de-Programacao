package equacoes_matematicas;

public class ProgressaoGeometrica {
	public static void progressaoGeometrica(int valorInicial, int razao) {
		int termo = 10;
		int valorAtual = valorInicial;
		for(int i=1; i<=termo; i++) {
			System.out.print(" " + valorAtual);
			valorAtual *= razao;
		}
	}
	public static void main(String[] args) {
		progressaoGeometrica(3,3);
	}
}
