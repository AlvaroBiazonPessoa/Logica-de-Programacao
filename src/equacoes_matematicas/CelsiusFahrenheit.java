package equacoes_matematicas;

public class CelsiusFahrenheit {
	public static float toCelsius(float fahrenheit) {
		return 5*(fahrenheit-32)/9;
	}
	public static float toFahrenheit(float celsius) {
		return celsius/5*9+32;
	}
	public static void main(String[] args) {
		toCelsius(32);
		toFahrenheit(0);
	}
}
