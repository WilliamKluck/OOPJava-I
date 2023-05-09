import java.util.Scanner;
public class Exercise02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		double meter = 0.305 * feet;
		System.out.print(feet + " feet is " + meter + " meters");
		input.close();
	}

}
