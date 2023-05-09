import java.util.Scanner;
public class Exercise03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Receive the amount AS AN INTEGER INSTEAD OF A DOUBLE
		System.out.print("Enter an amount as an integer, for example, $11.56 would be 1156: ");
		int amount = input.nextInt();

		int remainingAmount = (amount);
	
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		  
		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		   
		// Find the number of pennies in the remaining amount
		int numberOfPennies = (int)remainingAmount;
	
		// Display results
		System.out.println("Your amount $" + amount / 100 + "." + amount % 100 + " consists of"); 
		if (numberOfOneDollars > 1) {
			System.out.println("    " + numberOfOneDollars + " dollars");
		}
		else if (numberOfOneDollars > 0) {
			System.out.println("    " + numberOfOneDollars + " dollar");
		}
		if (numberOfQuarters > 1) {
			System.out.println("    " + numberOfQuarters + " quarters");
		}
		else if (numberOfQuarters > 0) {
			System.out.println("    " + numberOfQuarters + " quarter");
		}
		if (numberOfDimes > 1) {
			System.out.println("    " + numberOfDimes + " dimes");
		}
		else if (numberOfDimes > 0) {
			System.out.println("    " + numberOfDimes + " dime");
		} 
		if (numberOfNickels > 1) {
			System.out.println("    " + numberOfNickels + " nickels");
		}
		else if (numberOfNickels > 0) {
			System.out.println("    " + numberOfNickels + " nickel");
		} 
		if (numberOfPennies > 1) {
			System.out.println("    " + numberOfPennies + " pennies");
		}
		else if (numberOfPennies > 0) {
			System.out.println("    " + numberOfPennies + " penny");
		}
		input.close();
		}

}
