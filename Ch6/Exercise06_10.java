
public class Exercise06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=0; i< 10000; i++) {
			if(isPrime(i)) {
			System.out.printf("%d ", i);
			count++;
			}
			if (count == 10) {
				count = 0;
				System.out.println();
			}
		}
	}
	  /** Check whether number is prime */
	  public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	  }
}
