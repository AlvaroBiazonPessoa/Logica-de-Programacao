package vetores;

public class InverteVetor {
	public static void inverterVetor(int[] vetor) {
		int tamanhoVetorOriginal = vetor.length;
		int tamanhoVetorZerado = vetor.length-1;
		int contadorAuxiliar = 0;
		int[] vetorAuxiliar = new int[tamanhoVetorOriginal];
		for(int i=tamanhoVetorZerado; i>=0; i--) {
			System.out.print((vetorAuxiliar[contadorAuxiliar++] = vetor[i]) + " ");
		}
	}
	public static void main(String[] args) {
		int[] vetor = {100, 200, 300, 400, 500};
		inverterVetor(vetor);
	}
}
