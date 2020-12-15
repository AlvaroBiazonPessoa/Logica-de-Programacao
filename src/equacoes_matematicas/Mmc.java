package equacoes_matematicas;

public class Mmc {
	public static int mmcEuclides(int n1, int n2) {
		int resto;
		int a = n1;
		int b = n2;
		do {
			resto = a%b;
			a = b;
			b = resto;
		} while(resto != 0);
		return (n1*n2)/a;
	}
	public static void main(String[] args) {
		mmcEuclides(12, 6);
	}
}
