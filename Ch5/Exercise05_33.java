
public class Exercise05_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The four perfect number less than 10,000:");

		int sum;
		for (int number = 1; number < 10000; number++) {
			sum = 0;	// Reset Accumulator to 0

			for (int possibleFactor = 1; possibleFactor < number; possibleFactor++) {
				// Test for divisor
				if (number % possibleFactor == 0)
					sum += possibleFactor;
			}
			// Test if sum of all positive divisors are equal to number
			if (number == sum)
				System.out.printf("%20d\n", number);
		}
	}

}
