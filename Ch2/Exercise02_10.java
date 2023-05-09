import java.util.Scanner;
public class Exercise02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double mass = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		double Energy = mass * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + Energy);
		input.close();
	}

}
