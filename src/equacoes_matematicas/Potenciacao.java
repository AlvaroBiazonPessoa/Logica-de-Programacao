package equacoes_matematicas;

public class Potenciacao {
	public static int pow(int base, int expoente) {
		int resultado = base;
		for(int i=1; i<expoente; i++) {
			resultado *= base;
		}
		return resultado;
	}
	public static void main(String[] args) {
		System.out.println(pow(3,2));
	}
}
