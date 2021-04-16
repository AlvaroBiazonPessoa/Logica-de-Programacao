/*
 Faça um programa que peça 10 números inteiros, calcule e mostre
 a quantidade de números pares e a quantidade de números ímpares
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
		System.out.println("Números pares: " + numerosPares);
		System.out.println("Números ímpares: " + numerosImpares);
	}
}
