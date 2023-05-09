import java.util.Scanner;
public class Exercise02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter monthly saving amount: ");
		double savings = input.nextDouble();
		double annualInterestRate = .05/12; //5% for the year
		double firstMonth = savings * (1 + annualInterestRate);
		double secondMonth = (savings + firstMonth) * (1 + annualInterestRate);
		double thirdMonth = (savings + secondMonth) * (1 + annualInterestRate);
		double fourthMonth = (savings + thirdMonth) * (1 + annualInterestRate);
		double fifthMonth = (savings + fourthMonth) * (1 + annualInterestRate);
		double sixthMonth = (savings + fifthMonth) * (1 + annualInterestRate);
		
		System.out.println("After the first month, the account value is " + firstMonth);
		System.out.println("After the second month, the account value is " + secondMonth);
		System.out.println("After the third month, the account value is " + thirdMonth);
		System.out.println("After the sixth month, the account value is " + sixthMonth);
		input.close();
	}

}
