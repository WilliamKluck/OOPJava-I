
public class Exercise06_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-11s %-14s |     %-14s %s%n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		System.out.println("-------------------------------------------------------");
		
		for (double celsius = 40, fahrenheit = 120; celsius > 30; celsius--, fahrenheit = fahrenheit - 10) {
			System.out.printf("%-11.2f %-14.2f |     %-14.2f %.2f%n",
					celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0/5) * celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0/9) * (fahrenheit - 32);
	}
}
