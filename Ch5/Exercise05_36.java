import java.util.Scanner;
public class Exercise05_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN-10 number: ");
		int isbn = input.nextInt();
		int newISBN = isbn;
		int sum = 0;
		for(int i=9; i > 0; i--) {
			
			int d = newISBN % 10;
			newISBN = newISBN / 10;
			sum += d * i;
		}
		int d10 = sum % 11;
		System.out.print("The ISBN-10 number is ");
		
		if(d10 == 10) {
			System.out.println(isbn + "X");
		}
		else {
			if (String.valueOf(isbn).length() <= 9) {
				for(int i=9; i> String.valueOf(isbn).length(); i--) {
				System.out.print("0");
				}
			}
		System.out.printf("%d%d", isbn, d10);
		}
		input.close();
	}

}