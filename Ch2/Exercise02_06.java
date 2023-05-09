import java.util.Scanner;
public class Exercise02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		int ones = number % 10;
		int remainingNumber = number / 10;
		int tens= remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int hundreds = remainingNumber % 10;
		int sum = ones + tens + hundreds;
		System.out.println("The sum of all digits in " + number + " is " + sum);
		input.close();
	}

}
