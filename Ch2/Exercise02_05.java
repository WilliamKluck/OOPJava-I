import java.util.Scanner;
public class Exercise02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter subtotal and gratuity rate, (eg 100.57 15): ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		gratuityRate = gratuityRate / 100.0;
		double gratuity = (int)((subtotal * gratuityRate) * 100) / 100.0;
		double total = (int)((subtotal + gratuity) * 100) / 100.0;
		System.out.print("The gratuity is $" + gratuity + " total is $" + total);
		input.close();
	}

}
