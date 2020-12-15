package equacoes_matematicas;

public class Mdc {
	//Foi utilizado o algoritmo de Euclides para determinar o Máximo divisor comum 
	public static int mdcEuclides(int n1, int n2) {
		int resto; 
		do {
			resto = n1%n2;
			n1 = n2;  
			n2 = resto; 
		} while(resto != 0); 
		return n1; 
	}
	public static void main(String[] args) {
		mdcEuclides(42, 12);
	}
}
