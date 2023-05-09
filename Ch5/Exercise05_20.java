public class Exercise05_20 {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 8 per line
    int number = 3; // A number to be tested for primeness
    int topnumber = 1000; //The highest number to be tested
    int count = 0;
    System.out.println("The prime numbers between 2 and 1000 are:\n");

    // Repeatedly find prime numbers
    while (number < topnumber) {
      // Assume the number is prime
      boolean isPrime = true; // Is the current number prime?

      // Test if number is prime
      for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) { // If true, number is not prime
          isPrime = false; // Set isPrime to false          
          break; // Exit the for loop
        }
      }

      // Print the prime number and increase the count
      if (isPrime) {
    	  count++;
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Print the number and advance to the new line
          System.out.println(number);
        }
        else
          System.out.print(number + " ");
      }

      // Check if the next number is prime
      number++;
    }
  }
}