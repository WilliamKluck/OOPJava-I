import java.util.Scanner;
public class Exercise07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the integers between 1 and 100: ");
		int[] numbers = new int[100];
		
		initializeArray(numbers);
		countOccurances(numbers);
		
	}
	
	public static void initializeArray(int[] a) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < a.length;  i++) {
			a[i] = input.nextInt();
			if (a[i] == 0) {
				input.close();
				return;
			}
		}
		input.close();
	}
	
	public static void countOccurances(int[] a) {
		
		for(int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 0;j < a.length; j++) {
				if (a[j] == i) {
				count++;
				}
			}
			if (count != 0) {
				System.out.printf("%d occurs %d times%n", i, count);
			}
		}
	}
	
}
