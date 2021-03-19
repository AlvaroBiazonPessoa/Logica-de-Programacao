package equacoes_matematicas;

public class ProgressaoAritmetica {
	public static void progressaoAritmetica(int valorInicial, int razao) {
		int termo = 10;
		int valorAtual = valorInicial;
		for(int i=1; i<=termo; i++) {
			System.out.print(" " + valorAtual);
			valorAtual += razao;
		}	
	}
	public static void main(String[] args) {
		progressaoAritmetica(4, 8);
	}
}
