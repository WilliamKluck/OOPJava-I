import java.util.Scanner;
public class Exercise03_20 {

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
		
		boolean isTemperatureValid = temperatureAmbient > -58 && temperatureAmbient < 41;
		boolean isVelocityValid = velocityWind >= 2;
		
		if(isTemperatureValid && isVelocityValid) {
			System.out.println("The wind chill index is " + temperatureWindChill);
		}
		else if (isTemperatureValid){
			System.out.println("The wind speed is invalid.");
		}
		else if (isVelocityValid) {
			System.out.println("The temperature is invalid.");
		}
		else {
			System.out.println("The temperature and wind speed is invalid.");
		}
		input.close();
	}

}
