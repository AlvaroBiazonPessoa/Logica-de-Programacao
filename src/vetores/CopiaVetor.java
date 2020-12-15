package vetores;
import java.util.*;
public class CopiaVetor {
	public static void copiaVetor(int[] vetor1, int[] vetor2) {
		for(int i=0; i<vetor1.length; i++) {
			vetor2[i] = vetor1[i];
		}
	}
	public static void main(String[] args) {
		int[] vetor1 = {10, 20, 30, 40};
		int[] vetor2 = {1, 2, 4, 5};
		copiaVetor(vetor1,vetor2);
		System.out.println(">> Vetor1: " + Arrays.toString(vetor1));
		System.out.println(">> Vetor2: " + Arrays.toString(vetor2));
	}
}
