import java.util.Scanner;
public class Exercise02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the investment amount, for example 120000.95: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.print("Enter number of years as an integer, for example 5: ");
		double numberOfYears = input.nextDouble();
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
		System.out.print("Future value is $" + (int)(futureInvestmentValue * 100) / 100.0);
		input.close();
	}

}
