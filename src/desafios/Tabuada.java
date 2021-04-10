//Desenvolva um gerador de tabuada a partir do número que o usuário informar

package desafios;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.print(">>Informe o número que deseja ver a tabuada: ");
		numero = scanner.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
	}
}
