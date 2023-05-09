import java.util.Scanner;
public class Exercise04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = input.nextLine();
		System.out.printf("The length of the string is %d\nThe first character in the string is %c",
				string.length(), string.charAt(0));
		
		input.close();
	}

}
