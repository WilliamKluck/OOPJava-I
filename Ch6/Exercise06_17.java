import java.util.Scanner;
public class Exercise06_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}
	public static void printMatrix(int n) {
		for(int row = 1; row <= n; row++) {
			for (int character = 1; character <= n; character++) {
				System.out.printf("%d ", (int)(Math.random() + 0.5));
			}
			System.out.println();
		}
	}
}
