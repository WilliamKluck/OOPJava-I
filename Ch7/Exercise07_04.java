import java.util.Scanner;
public class Exercise07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = initializeArray();
		double average = computeAverage(a);
		int above = aboveorequalAverage(a, average);
		int below = belowAverage(a, average);
		
		System.out.printf("Average is %.1f%n"
				+ "Number of scores above or equal to the average: %d%n"
				+ "Number of scores below the average: %d%n"
				, average, above, below);
		
	}

	public static int[] initializeArray() {
		Scanner input = new Scanner(System.in);
		int[] a = new int[100];
		for (int i = 0; i < a.length;  i++) {
			System.out.print("Enter a new score: ");
			a[i] = input.nextInt();
			if (a[i] < 0) {
				int[] b = new int[i];
				System.out.println("Length of B is : " + b.length);
				for(int j = 0; j < b.length; j++) {
					b[j] = a[j];
				}
				input.close();
				return b;
			}
		}
		input.close();
		return a;
	}
	
	public static double computeAverage(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			System.out.println("Sum is: " + sum);
		}
		return sum / a.length;
	}
	
	public static int aboveorequalAverage(int[] a, double average) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= average) {
				count++;
			}
		}
		return count;
	}
	
	public static int belowAverage(int[] a, double average) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < average) {
				count++;
			}
		}
		return count;
	}
}
