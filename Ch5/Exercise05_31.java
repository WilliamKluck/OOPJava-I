import java.util.Scanner;
public class Exercise05_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: " );
		double initialDeposit = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonths = input.nextInt();
		
		double monthlyPercentageYield = annualPercentageYield / 1200;
		double accountTotal = initialDeposit;
		System.out.printf("%s %12s%n", "Month", "CD");
		for(int month=1; month <= numberOfMonths; month++) {
			accountTotal = accountTotal + ((accountTotal) * monthlyPercentageYield);
			System.out.printf("%4d %12.2f%n", month, accountTotal);
		}
		
		input.close();
	}

}