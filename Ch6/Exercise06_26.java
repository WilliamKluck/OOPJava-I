
public class Exercise06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBERS_PER_LINE = 10;
		final int TOTAL_NUMBERS = 100;
		int numCount = 1;
		int lineCount = 0;
		int number = 2;
		while (numCount <= TOTAL_NUMBERS) {
			if (isPrime(number) && isPalindrome(number)) {
				System.out.printf("%d ", number);
				lineCount++;
				numCount++;
			}
			if (lineCount == NUMBERS_PER_LINE) {
				System.out.println();
				lineCount = 0;
			}
			number++;
		}
	}

	
	public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	  }
	
	public static int reverse(int number) {
		int reverse = 0;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) { 
		if (number == reverse(number)) {
			return true;
		}
		else {
			return false;
		}
	}
}
