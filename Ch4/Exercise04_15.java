import java.util.Scanner;
public class Exercise04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		if (letter < 'A' || letter > 'z' || letter > 90 && letter < 97) {
			System.out.printf("%c is an invalid input", letter);
			System.exit(1);
		}
		double number = 0;
		if (letter < 'a') {
			int ascii = (int)letter - 64;
			number = ascii / 3.0;
		}
		else {
			int ascii = (int)letter - 96;
			number = ascii / 3.0;
		}
		System.out.printf("The corresponding number is %d", (int)Math.ceil(number) + 1);
		
		input.close();	
	}
}
