package vetores;
import java.util.Arrays;
import java.util.Random;

public class CarregaVetorAleatorio {
	//Procedimento utiliza a classe Math e a fun��o random() para gerar n�meros reais aleat�rios  
	public static void carregaVetorAleatorioMath(double[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = Math.random();
		}
	}
	//Procedimento utiliza a classe Random e a fun��o nextInt() para gerar n�meros inteiros aleat�rios 
	public static void carregaVetorAleatorioRandom(int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			Random random = new Random();
			int numeroAleatorio = random.nextInt(5);
			vetor[i] = numeroAleatorio;
		}
	}
	public static void main(String[] args) {
		double[] vetor1 = new double[3];
		carregaVetorAleatorioMath(vetor1);
		System.out.println(Arrays.toString(vetor1));
		
		int[] vetor2 = new int[3];
		carregaVetorAleatorioRandom(vetor2);
		System.out.println(Arrays.toString(vetor2));
	}
} 
