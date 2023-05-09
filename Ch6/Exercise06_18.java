import java.util.Scanner;
public class Exercise06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String password = input.next();
		if(isValidPassword(password)) {
			System.out.printf("%s is a Valid Password", password);
		}
		else {
			System.out.printf("%s is an Invalid Password", password);
		}
		input.close();
	}
	public static boolean isValidPassword(String password) {
		int digitcount=0;
		int lettercount=0;
		for (int i=0; i<password.length(); i++) {
			if(Character.isLetterOrDigit(password.charAt(i))) {
				if(Character.isDigit(password.charAt(i))) {
					digitcount++;
				}else {
					lettercount++;
				}
			}
		}
		if(lettercount + digitcount == password.length() && digitcount >= 2 && password.length() >= 8) {
			return true;
		}
		else {return false;}
	}
}
