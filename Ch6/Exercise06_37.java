import java.util.Scanner;
public class Exercise06_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
		input.close();
	}
	public static String format(int number, int width) {
		String str = "" + number;
		if (str.length() >= width) {
			return str;
		}
		else {
			width -= str.length();
			while (width > 0) {
				str = "0" + str;
				width--;
			}
			return str;
		}
	}
}
