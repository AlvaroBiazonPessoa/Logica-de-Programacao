//Faça um programa que leia 5 números e informe o maior número

package desafios;

import java.util.Scanner;

public class DesafioMaiorNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		int maiorNumero = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(">> ");
			numero = scanner.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.println(maiorNumero);
	}
}
