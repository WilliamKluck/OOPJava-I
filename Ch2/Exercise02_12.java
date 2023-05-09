import java.util.Scanner;
public class Exercise02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed v: ");
		double velocity = input.nextDouble();
		System.out.print("Enter acceleration a: ");
		double acceleration = input.nextDouble();
		double length = Math.pow(velocity, 2) / (2 * acceleration);
		System.out.println("The minimum runway length for this airplane is " + length + " meters");
		input.close();
	}

}
