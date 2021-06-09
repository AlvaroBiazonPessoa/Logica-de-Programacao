/*
 *An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 *Implement a function that determines whether a string that contains only letters is an isogram. 
 *Assume the empty string is an isogram.
 *
 **/

package string;

public class Isogram {
	
	public static boolean ehIsogram(String str) {
		String strUpperCase = str.toUpperCase();
		boolean resultado = true;
		int termino = strUpperCase.length();
		for(int atual = 0; atual < termino; atual++) {
			for(int atualPlus = atual+1; atualPlus < termino; atualPlus++) {
				if(strUpperCase.charAt(atual) == strUpperCase.charAt(atualPlus)) {
					resultado = false;
				}
			}
		}
		return resultado || str.isEmpty() ? true : false;
	}
	
	public static void main(String[] args) {
		String nome = "Alvaro";
		System.out.println(ehIsogram(nome));
		
		String palavra = "Gelo";
		System.out.println(ehIsogram(palavra));
		
		String termo = " ";
		System.out.println(ehIsogram(termo));
	}
}
