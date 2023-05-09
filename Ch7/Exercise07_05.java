import java.util.Scanner;
public class Exercise07_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = initializeArray();
		int[] b = distinctNumbers(a);
		
		System.out.printf("The number of distinct numbers is %d%n", b.length);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i <b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static int[] initializeArray() {
		int[] a = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < a.length; i++) {
			int number = input.nextInt();
			int differentCount = 0;
			for (int j = 0; j < i; j++) {
				if (number != a[j]) {
					differentCount++;
				}
			}
			if(differentCount == i) {
				a[i] = number;
			}
		}
		input.close();
		return a;
	}
	
	public static int[] distinctNumbers(int[] a) {
		int distinct = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				distinct++;
			}
		}
		int[] b = new int[distinct];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != 0) {
				distinct++;
				b[j] = a[i];
				j++;
			}
		}
		return b;
	}
}
