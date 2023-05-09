import java.util.Scanner;
public class Exercise04_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
		String isbn = input.next();
		char d1 = isbn.charAt(0);
		char d2 = isbn.charAt(1);
		char d3 = isbn.charAt(2);
		char d4 = isbn.charAt(3);
		char d5 = isbn.charAt(4);
		char d6 = isbn.charAt(5);
		char d7 = isbn.charAt(6);
		char d8 = isbn.charAt(7);
		char d9 = isbn.charAt(8);
		
		int d10 = (Character.getNumericValue(d1) * 1 + Character.getNumericValue(d2) * 2 
				+ Character.getNumericValue(d3) * 3 + Character.getNumericValue(d4) * 4 
				+ Character.getNumericValue(d5) * 5 + Character.getNumericValue(d6) * 6 
				+ Character.getNumericValue(d7) * 7 + Character.getNumericValue(d8) * 8 
				+ Character.getNumericValue(d9) * 9) % 11;
		
		if(d10 > 9) {
			System.out.println("The ISBN-10 number is " + isbn + "X");
		}
		else {
		System.out.println("The ISBN-10 number is " + isbn + d10);
		}
		input.close();
	}

}
