import java.util.Scanner;
public class Exercise04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		char asciiCode = (char)input.nextInt();
		
		System.out.printf("The character for ASCII code %d is %c", (int)asciiCode, asciiCode); 
		
		input.close();
	}

}
