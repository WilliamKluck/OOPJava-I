import java.util.Scanner;
public class Exercise06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int positive = input.nextInt();
		if (isPalindrome(positive)) {
			System.out.printf("%d is a palindrome", positive);
		}
		else {
			System.out.printf("%d is not a palindrome", positive);
		}
		input.close();
	}
	
	public static int reverse(int number) {
		int reverse = 0;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) { 
		if (number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
	}
}
