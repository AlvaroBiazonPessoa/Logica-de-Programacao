//Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50

package desafios;

public class NumerosImpares {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
