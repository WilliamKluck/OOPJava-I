import java.util.Scanner;
public class Exercise02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		double weightKilograms = weight * 0.45359237;
		double heightMeters = height * 0.0254;
		double bmi = weightKilograms / Math.pow(heightMeters, 2);
		System.out.println("BMI is " + bmi);
		input.close();
	}

}
