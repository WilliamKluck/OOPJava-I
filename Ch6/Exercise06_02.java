import java.util.Scanner;
public class Exercise06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		System.out.printf("The sum of the digits of %d is %d", (int)Math.abs(number), sumDigits(number));
		input.close();
	}
	public static int sumDigits(long n) {
		n = (int)Math.abs(n);
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}
