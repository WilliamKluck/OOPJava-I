import java.util.Scanner;
public class Exercise06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		reverse(integer);
		input.close();
	}
	public static void reverse(int number) {
		int reverse = 0;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		System.out.print(reverse);
	}
}
