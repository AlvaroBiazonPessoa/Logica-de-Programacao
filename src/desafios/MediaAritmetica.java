/*
 Faça um programa que calcule e mostre a média 
 aritmética de N notas.
 */

package desafios;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double quantidadeNotas, nota, soma= 0, mediaAritmetica;
		System.out.print(">>Digite a quantidade de notas: ");
		quantidadeNotas = scanner.nextDouble();
		for(int i=1; i<=quantidadeNotas; i++) {
			System.out.print(">> ");
			nota = scanner.nextDouble();
			soma += nota;
		}
		mediaAritmetica = soma/quantidadeNotas;
		System.out.println("Média Aritmética: " + mediaAritmetica);
	}
}
