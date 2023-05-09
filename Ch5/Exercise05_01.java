import java.util.Scanner;
public class Exercise05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers ending with 0: ");
		int sum = 0, positive = 0, negative = 0;
		
		int integer = -1;
		while (integer != 0) {
			integer = input.nextInt();
			sum += integer;
		
			if (integer > 0) {
				positive++;
			}
			else if (integer < 0) {
				negative++;
			}
		}
		if (sum == 0 && positive == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		float avg = (float)sum / (positive + negative);
		System.out.printf("The number of positives is %d\nThe number of negatives is %d\nThe total is %d"
				+ "\nThe average is %f", positive, negative, sum, avg);
		input.close();
	}

}
