import java.util.Scanner;
public class Exercise04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		System.out.printf("The Unicode for character %c is %d", ch, (int)ch); 
		
		input.close();
	}

}
