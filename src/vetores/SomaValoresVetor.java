package vetores;

public class SomaValoresVetor {
	public static int somaValoresVetor(int[] vetor) {
		int soma = 0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}
	public static void main(String[] args) {
		int[] idades = {18, 20, 35};
		System.out.println(somaValoresVetor(idades));
	}
}
