import java.util.Scanner;
public class Exercise05_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter number of years as an integer, for example 5: ");
		int numberOfYears = input.nextInt();
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		System.out.printf("Monthly Payment: %f %nTotal Payment: %f %n", monthlyPayment, totalPayment);
		System.out.printf("%-14s %-14s %-14s %s\n", "Payment#", "Interest", "Principal", "Balance");
		double balance = loanAmount;
		for(int paymentNumber = 1; paymentNumber <= numberOfYears * 12; paymentNumber++) {
			double interest = (int)(monthlyInterestRate * balance * 100) / 100.0;
			double principal = (int)((monthlyPayment - interest) * 100) / 100.0;
			balance = (int)((balance - principal) * 100) / 100.0;
			System.out.printf("%-14d %-14f %-14f %f\n", paymentNumber, interest, principal, balance);
		}
		input.close();
	}
}