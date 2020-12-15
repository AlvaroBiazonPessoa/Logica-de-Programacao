package equacoes_matematicas;

public class Primo {
	public static boolean ehPrimo(int num) {
		int total = 0;
		for(int i=1; i<=num+1; i++) {
			if(num%i==0) {
				total++;
			}
		}
		return total == 2 ? true : false;
	}
	public static void main(String[] args) {
		ehPrimo(2);
	}
}
