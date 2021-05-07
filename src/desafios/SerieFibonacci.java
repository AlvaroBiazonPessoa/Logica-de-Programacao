/*
 A série de Fibonacci é tomada pela sequência
 1, 1, 2, 3, 5, 8, 13, 21, 34. 55,.... Faça um
 programa capaz de gerar a série até o n-ésimo 
 número
 */

package desafios;

import java.util.Scanner;

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, primeiro = 1, segundo = 0, proximo;
		System.out.print(">>Digite o n-ésimo termo: ");
		numero = scanner.nextInt();
		for(int i=0; i<=numero; i++) {
			proximo = primeiro+segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " , ");
		}
	}
}
