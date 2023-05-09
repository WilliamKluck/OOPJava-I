import java.util.Scanner;
public class Exercise04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		if('A' <= letter && 'z' >= letter) {
			if (letter == 'A' || letter == 'a'
				|| letter == 'E' || letter == 'e'
				|| letter == 'I' || letter == 'i'
				|| letter == 'O' || letter == 'o'
				|| letter == 'U' || letter == 'u'
				|| letter == 'Y' || letter == 'y') {
				System.out.printf("%c is a vowel", letter);
			}
			else {
				System.out.printf("%c is a consonant", letter);
			}
		}
		else {
			System.out.printf("%c is an invalid input", letter);
		}
		
		input.close();
	}

}
