import java.util.Scanner;
public class Exercise05_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter number of years as an integer, for example 5: ");
		int numberOfYears = input.nextInt();
		
		System.out.printf("%-19s %-19s %s%n", "Interest Rate", "Monthly Payment", "Total Payment");
		for(double annualInterestRate=5; annualInterestRate <= 8; annualInterestRate += .125) {
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%.3f%-14c %-19.2f %.2f%n", annualInterestRate, '%', monthlyPayment, totalPayment);
		}
		input.close();
	}

}
