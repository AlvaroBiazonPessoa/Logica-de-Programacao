package vetores;
import java.util.Scanner;

public class BucaValorVetor {
	public static void buscaValorVetor(String[] vetor, String valor) {
		int indice = -1;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].equals(valor)) {
				indice = i;
				break;
			}
		}
		if(indice == -1) {
			System.out.println("Valor não encontrado no vetor");
		} else {
			System.out.println("Valor encontrado na posição: " + indice);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] estados = {"SP", "MG", "RJ", "SC", "RS", "ES"};
		System.out.print(">>Digite o valor: ");
		String valor = scanner.nextLine();
		buscaValorVetor(estados, valor);
	}
}
