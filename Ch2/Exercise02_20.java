import java.util.Scanner;
public class Exercise02_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and annual interest rate: ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double interest = (int)((balance * (annualInterestRate / 1200)) * 100) / 100.0;
		System.out.println("The interest is " + interest);
		input.close();
		
	}

}
