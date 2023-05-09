import java.util.Scanner;
import java.util.Currency;
import java.util.Locale;
public class Exercise03_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Currency yuan = Currency.getInstance(Locale.CHINA);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int conversion = input.nextInt();
		
		double dollar = 0;
		double RMB = 0;
		if (conversion == 0) {
			System.out.print("Enter the dollar amount: ");
			dollar = input.nextDouble();
			RMB = dollar * exchangeRate;
			System.out.println("$" + dollar + " is " + RMB + " Yuan");
		}
		else {
			System.out.print("Enter the RMB amount: ");
			RMB = input.nextDouble();
			dollar = RMB / exchangeRate;
			System.out.println(yuan.getSymbol(Locale.CHINA) + RMB + " is " + dollar + " dollars");
		}
		
		input.close();
	}

}
