import java.util.Scanner;
public class Exercise06_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print("Enter a character: ");
		char a = input.next().charAt(0);
		
		System.out.printf("The number of occurrences of %c in %s is %d", a, str, count(str, a));
		
		input.close();
	}
	
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == a ) {
				count++;
			}
		}
		return count;
	}
}
