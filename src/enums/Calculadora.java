package enums;

public class Calculadora {
	enum Operacao {
		SOMAR("+") {
			@Override
			public double executarOperacao(double n1, double n2) {
				return n1+n2;
			}
		}, SUBTRAIR("-") {
			@Override
			public double executarOperacao(double n1, double n2) {
				return n1-n2;
			}
		}, MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double n1, double n2) {
				return n1*n2;
			}
		}, DIVIDIR("/") {
			@Override
			public double executarOperacao(double n1, double n2) {
				return n1/n2;
			}
		};
		private String simbolo;
		Operacao(String simbolo) {
			this.simbolo = simbolo;
		}
		public String toString() {
			return this.simbolo;
		}
		public abstract double executarOperacao(double n1, double n2);
	}
	
	public static void main(String[] args) {
		double n1 = 25;
		double n2 = 5;
		for(Operacao op : Operacao.values()) {
			System.out.println(n1 + op.toString() + n2 + "=" + op.executarOperacao(n1,n2));
		}
	}
}
