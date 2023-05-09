import java.util.Scanner;

public class Exercise05_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int n = 10;
		double number;
		double mean =0, deviation = 0;
		for(int i = 0; i < n; i++) {
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		mean += number;
		deviation += number * number;
		}
		deviation = Math.sqrt((deviation - ((mean * mean) / n)) / (n - 1));
		mean /= n;
		
		System.out.printf("The mean is %.2f%n"
				+ "The standard deviation is %f", mean, deviation);
		input.close();
	}

}
