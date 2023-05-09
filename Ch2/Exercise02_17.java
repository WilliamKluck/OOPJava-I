import java.util.Scanner;
public class Exercise02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperatureAmbient = input.nextDouble();
		System.out.print("Enter the wind speed miles per hour (must be greater than or equal to 2) : ");
		double velocityWind = input.nextDouble();
		double temperatureWindChill = 35.74 + (0.6215 * temperatureAmbient)
				- (35.75 * Math.pow(velocityWind, 0.16)) +
				(0.4275 * temperatureAmbient * Math.pow(velocityWind, 0.16));
		System.out.println("The wind chill index is " + temperatureWindChill);
		input.close();
	}

}
