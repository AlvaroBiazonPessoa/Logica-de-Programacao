/*
 * A pangram is a sentence that contains every single letter of the alphabet at least once. 
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, 
 * because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. 
 * Return True if it is, False if not. Ignore numbers and punctuation.
 * 
 * */

package string;

import java.util.HashSet;

public class Pangram {
	
	public static boolean detectarPengram(String str) {
		String strUpperCase = str.toUpperCase().replaceAll(" ", "");
		char[] arrayChar = strUpperCase.toCharArray();
		HashSet<Character> hashChar = new HashSet<>();
		for(char caractere : arrayChar) {
			hashChar.add(caractere);
		}
		return hashChar.size() == 26 ? true : false;
	}
	
	public static void main(String[] args) {
		String frase = "The quick brown fox jumps over the lazy dog";
		System.out.println(detectarPengram(frase));
		
		String outraFrase = "Feliz Natal";
		System.out.println(detectarPengram(outraFrase));
	}
}
