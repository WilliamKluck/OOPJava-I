import java.util.Scanner;
public class Exercise06_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive number: ");
		long number = input.nextLong();
		
		System.out.printf("The sqrt for %.1f is %f", (double)number, sqrt(number));
		input.close();
	}
	public static double sqrt(long n) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2;
		while (Math.abs(lastGuess - nextGuess) > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		return nextGuess;
	}
}
