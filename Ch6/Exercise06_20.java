import java.util.Scanner;
public class Exercise06_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		System.out.printf("The number of letters is %d", countLetters(str));
		
		input.close();
	}
	public static int countLetters(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
