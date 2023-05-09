import java.util.Scanner;
public class Exercise05_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int uppercaseCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				uppercaseCount++;
			}
		}
		System.out.printf("The number of uppercase letters is %d", uppercaseCount);
		input.close();
	}

}
