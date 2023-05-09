import java.util.Scanner;
public class Exercise03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 3-digit integer: ");
		int numbers = input.nextInt();
		int ones = numbers % 10;
		int hundreds = numbers / 100;
		
		if (ones == hundreds) {
			System.out.println(numbers + " is a palidrome.");
		}
		else {
			System.out.println(numbers + " is not a palidrome.");
		}
		input.close();
	}

}
