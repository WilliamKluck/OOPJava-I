import java.util.Scanner;
public class Exercise03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		boolean both = number % 5 == 0 && number % 6 == 0;
		boolean either = number % 5 == 0 || number % 6 == 0;
		boolean one = number % 5 == 0 ^ number % 6 == 0;
		
		System.out.println("Is " + number + " divisible by 5 and 6? " + both);
		System.out.println("Is " + number + " divisible by 5 or 6? " + either);
		System.out.println("Is " + number + " divisible by 5 or 6 but not both? " + one);
		
		input.close();
	}

}
