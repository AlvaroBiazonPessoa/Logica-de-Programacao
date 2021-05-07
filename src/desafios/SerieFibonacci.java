/*
 A s�rie de Fibonacci � tomada pela sequ�ncia
 1, 1, 2, 3, 5, 8, 13, 21, 34. 55,.... Fa�a um
 programa capaz de gerar a s�rie at� o n-�simo 
 n�mero
 */

package desafios;

import java.util.Scanner;

public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, primeiro = 1, segundo = 0, proximo;
		System.out.print(">>Digite o n-�simo termo: ");
		numero = scanner.nextInt();
		for(int i=0; i<=numero; i++) {
			proximo = primeiro+segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.print(proximo + " , ");
		}
	}
}
