import java.util.Scanner;
public class Exercise05_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount to be saved for each month: " );
		double monthlyDeposit = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of months: ");
		int numberOfMonths = input.nextInt();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		double accountTotal = 0;
		for(int month=1; month <= numberOfMonths; month++) {
			accountTotal = (monthlyDeposit + accountTotal) * (1 + monthlyInterestRate);
		}
		switch(numberOfMonths) {
		case 1: System.out.printf("After the %dst month, the account value is %f", numberOfMonths, accountTotal); break;
		case 2: System.out.printf("After the %dnd month, the account value is %f", numberOfMonths, accountTotal); break;
		case 3: System.out.printf("After the %drd month, the account value is %f", numberOfMonths, accountTotal); break;
		default: System.out.printf("After the %dth month, the account value is %f", numberOfMonths, accountTotal); break;
		}
		
		input.close();
	}

}
