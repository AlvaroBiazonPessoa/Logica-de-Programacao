package vetores;
import java.util.Arrays;
public class ValorRepitidoVetor {
	public static int valorRepetido(int[] vetor) {
		int i, j, resp = 0;
		int tamanhoVetor = vetor.length;
		for(i=0; i<=tamanhoVetor; i++) {
			for(j = i + 1; j<tamanhoVetor; j++) {
				if(vetor[j] == vetor[i]) {
					resp = 1;
				}
			}
		}
		return resp;
	}
	public static void main(String[] args) {
		int[] numeros = {5, 9, 8, 8, 200, 90, 8, 9};
		System.out.println(Arrays.toString(numeros));
		System.out.println(">>Numeros repitidos: " + valorRepetido(numeros));
	}
}
