/*
 Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre
 a quantidade de n�meros pares e a quantidade de n�meros �mpares
 */
package desafios;

import java.util.Scanner;

public class TotalNumerosParesEImpares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int numerosPares = 0;
		int numerosImpares = 0;
		for(int i=1; i<=10; i++) {
			System.out.print(">> ");
			numero = scanner.nextInt();
			if(numero%2 != 0) {
				numerosImpares++;
			} else {
				numerosPares++;
			}
		}
		System.out.println("N�meros pares: " + numerosPares);
		System.out.println("N�meros �mpares: " + numerosImpares);
	}
}
