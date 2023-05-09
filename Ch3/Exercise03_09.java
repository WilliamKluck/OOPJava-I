import java.util.Scanner;
public class Exercise03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
		int isbn = input.nextInt();
		int d1 = isbn / 100000000;
		int newISBN = isbn % 100000000;
		int d2 = newISBN / 10000000;
		newISBN = newISBN % 10000000;
		int d3 = newISBN / 1000000;
		newISBN = newISBN % 1000000;
		int d4 = newISBN / 100000;
		newISBN = newISBN % 100000;
		int d5 = newISBN / 10000;
		newISBN = newISBN % 10000;
		int d6 = newISBN / 1000;
		newISBN = newISBN % 1000;
		int d7 = newISBN / 100;
		newISBN = newISBN % 100;
		int d8 = newISBN / 10;
		newISBN = newISBN % 10;
		int d9 = newISBN;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + 
				d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		System.out.println("The ISBN-10 number is " + isbn + d10);
		
		input.close();
	}

}
