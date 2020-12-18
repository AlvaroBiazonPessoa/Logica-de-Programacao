package vetores;

public class MaiorMenorValorVetor {
	public static void maiorMenorValor(int[] vetor) {
		int maiorValor = vetor[0];
		int menorValor = vetor[0];
		for(int i=1; i<vetor.length; i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			if(vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}
		System.out.println("Maior: " + maiorValor);
		System.out.println("Menor: " + menorValor);
	}
	public static void main(String[] args) {
		int[] vetor = {2, 10, 1, 45};
		maiorMenorValor(vetor);
	}
}
