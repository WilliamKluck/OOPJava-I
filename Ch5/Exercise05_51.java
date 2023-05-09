import java.util.Scanner;
public class Exercise05_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str1 = input.nextLine();
		System.out.print("Enter another string: ");
		String str2 = input.nextLine();
		int shortestStr = 0;
		String commonPrefix = "";
		if (str1.length() > str2.length()) {
			shortestStr = str2.length();
		}
		else {
			shortestStr = str1.length();
		}
		if(str1.charAt(0) != str2.charAt(0)) {
			System.out.println("There is no common prefix");
			System.exit(1);
		}
		for(int i = 0; i < shortestStr; i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				commonPrefix += str1.charAt(i);
			}
		}
		
		System.out.printf("The longest common prefix is: %s", commonPrefix);
		input.close();
	}

}
