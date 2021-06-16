/*
 * Faça um programa que descubra a quantidade total de vogais de uma determinada string.
 */

package string;

public class TotalVogais {
	public static int totalVogais(String str) {
		String strUpperCase = str.toUpperCase();
		int termino = strUpperCase.length();
		int totalVogais = 0;
		for(int atual = 0; atual < termino; atual++) {
			char ch = strUpperCase.charAt(atual);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				totalVogais++;
			}
		}
		
		return totalVogais;
	}
	public static void main(String[] args) {
		String artista = "Michael Jackson";
		System.out.println(totalVogais(artista));
	}
}
