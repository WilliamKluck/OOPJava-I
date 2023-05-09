import java.util.Scanner;
public class Exercise05_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int integer = input.nextInt();
		System.out.print("The factors for 120 are ");
		for(int i = 2; i <= integer; i++) {
			if (integer % i == 0) {
				integer /= i;
				System.out.printf("%d ", i);
				i--;
			}
		}
		input.close();
	}

}
