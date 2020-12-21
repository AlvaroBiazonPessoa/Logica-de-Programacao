package vetores;

public class ValorRepetidoVetor {
	public static int valorRepetidoVetor(String[] vetor) {
		int cont = 0;
		for(int i=0; i<vetor.length; i++) {
			for(int j=i+1; j<vetor.length; j++) {
				if(vetor[j]==vetor[i]) {
					cont++;
				}
			}
		}
		return cont;
	}
	public static void main(String[] args) {
		String[] nomes = {"Álvaro", "Regina", "Beatriz", "Álvaro"};
		System.out.println(valorRepetidoVetor(nomes));
	}
}
