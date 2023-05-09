import java.util.Scanner;
public class Exercise05_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int decimal = input.nextInt();
		String binary = "";
		
		while (decimal>=1) {
			if (decimal % 2 == 0) {
				binary = "0" + binary;
			}
			else {
				binary = "1" + binary;
			}
			decimal /= 2;
		}
		System.out.print(binary);
		input.close();
	}
}
