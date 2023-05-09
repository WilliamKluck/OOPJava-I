
import java.util.Scanner;
public class Exercise05_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		int gcd = 1;
		int d = Math.min(n1, n2);
		while (d > 0) {
			if (n1 % d == 0 && n2 % d == 0) {
				gcd = d;
				break;
			}
			d--;
		}
		/*int gcd = 1;
		int k = 2;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		k++;
		}*/
		
		System.out.println("The greatest common divisor for " + n1 + 
				" and " + n2 + " is " + gcd);
		input.close();
	}

}
