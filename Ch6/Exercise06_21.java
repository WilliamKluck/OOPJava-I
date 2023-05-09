import java.util.Scanner;
public class Exercise06_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String phone = input.next();
		for(int i = 0; i< phone.length(); i++) {
			if(Character.isLetter(phone.charAt(i))) {
				System.out.printf("%d", getNumber(Character.toUpperCase(phone.charAt(i))));
			}
			else {
				System.out.printf("%c", phone.charAt(i));
			}
		}
		input.close();
	}
	public static int getNumber(char uppercaseLetter) {
		if (uppercaseLetter < 'A' || uppercaseLetter > 'Z') {
			System.out.printf("%c is an invalid input", uppercaseLetter);
			return -1;
		}
		int ascii = (int)uppercaseLetter - 64;
		if (uppercaseLetter >= 'S') {
			switch(uppercaseLetter) {
				case 'S': return 7;
				case 'T': 
				case 'U':
				case 'V': return 8;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z': return 9;
			}
			return -1;
		}
		else {
			return (int)Math.ceil(ascii / 3.0) + 1;
		}
	}
}
