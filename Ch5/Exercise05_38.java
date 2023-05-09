import java.util.Scanner;
public class Exercise05_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		String octal = "";
		String decimal = "" + number;
		while (number >= 1) {
			int digit = number % 8;
			octal = digit + octal;
			number /= 8;
		}
		System.out.printf("%s's octal representation is %s", decimal, octal);
		
		input.close();
	}

}
