import java.util.Scanner;
public class Exercise07_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.print("Enter 5 numbers: ");
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		int greatestCommonDenominator = gcd(numbers);
		
		System.out.println(greatestCommonDenominator);
		input.close();
	}
	
	public static int gcd(int[] numbers) {
		int least = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(least > numbers[i]) {
				least = numbers[i];
			}
		}
		System.out.println("least: " + least);
		int gcd = 0;
		for (int i = 1; i < least; i++) {
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i == 0) {
					count++;
					System.out.println("count: " + count);
				}
				if (count == numbers.length) {
					gcd = i;
				}
			}
		}
		return gcd;
	}
}
