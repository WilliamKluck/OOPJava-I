import java.util.Scanner;
public class Exercise05_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 12 digits of an ISBN number as a string: ");
		String isbn12 = input.next();
		int num;
		int sum = 0;
		for(int i=0; i < isbn12.length(); i++) {
			if(Character.isDigit(isbn12.charAt(i))) {
				num = Character.getNumericValue(isbn12.charAt(i));
				
				if (i % 2 == 0) {
					sum += num;
				}
				else {
					sum += 3 * num;
				}
			}
			else {
				System.out.printf("Invalid Input at Character %d", i+1);
				System.exit(1);
			}
		}
		int isbn13 = 10 - sum % 10;
		if (isbn13 == 10) {
			isbn13 = 0;
		}
		System.out.printf("The ISBN-13 number is %s%d", isbn12, isbn13);
		input.close();
	}

}
