import java.util.Scanner;
public class Exercise04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		if (decimal < 10) {
			System.out.printf("The hex value is %d", decimal);
		}
		else if (decimal > 9 && decimal < 16) {
			decimal = decimal - 10;
			char hex = 'A';
			hex += decimal;
			System.out.printf("The hex value is %c", hex);
		}
		else {
			System.out.printf("%d is an invalid input", decimal);
		}
		input.close();
	}

}
