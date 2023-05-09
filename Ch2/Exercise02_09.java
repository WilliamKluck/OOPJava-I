import java.util.Scanner;
public class Exercise02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		double velocityInitial = input.nextDouble();
		double velocityEnd = input.nextDouble();
		double time = input.nextDouble();
		double acceleration = (velocityEnd - velocityInitial) / time;
		System.out.println("The average acceleration is " + acceleration);
		input.close();
	}

}
