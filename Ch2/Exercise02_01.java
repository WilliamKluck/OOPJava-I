import java.util.Scanner;
public class Exercise02_01 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		input.close();
	}
}
