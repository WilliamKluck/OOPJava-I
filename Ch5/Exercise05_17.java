import java.util.Scanner;
public class Exercise05_17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();
		input.close();
		int lineNumber = 1;
		for (lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
			for (int space = 0; space <= (numberOfLines - lineNumber) * 2; space++) {
				System.out.print(" ");
			}
			for (int number = lineNumber; number >= 1; number--) {
				System.out.printf("%d ", number);
			}
			for (int number = 2; number <= lineNumber; number++) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}

}