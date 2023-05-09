import java.util.Scanner;
public class Exercise06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter line number: ");
		int numberOfLines = input.nextInt();
		displayPattern(numberOfLines);
		input.close();
	}
	public static void displayPattern(int n) {
		for (int lineNumber = 1; lineNumber <= n; lineNumber++) {
			for (int space = 0; space <= (n - lineNumber) * 2; space++) {
				System.out.print(" ");
			}
			for (int number = lineNumber; number >= 1; number--) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}
}
