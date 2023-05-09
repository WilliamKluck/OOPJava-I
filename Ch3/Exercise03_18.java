import java.util.Scanner;
public class Exercise03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double weight = input.nextDouble();
		double cost = 0;
		if (weight <= 0) {
			System.out.println("Invalid input.");
		}
		else if (weight <= 1 ) {
			cost = 3.5;
		}
		else if (weight <= 3) {
			cost = 5.5;
		}
		else if (weight <= 10) {
			cost = 8.5;
		}
		else if (weight <= 20) {
			cost = 10.5;
		}
		else {
			System.out.println("The package cannot be shipped.");
		}
		
		System.out.println("The shipping cost is $" + cost );
		input.close();
	}

}
