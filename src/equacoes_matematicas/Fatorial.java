package equacoes_matematicas;

public class Fatorial {
	public static int fatorial(int numero) {
		int fatorial = 1;
		for(int i=numero; i>0; i--) {
			fatorial *= i;
		}
		return fatorial;
	}
	public static void main(String[] args) {
		System.out.println(fatorial(10));
	}
}
