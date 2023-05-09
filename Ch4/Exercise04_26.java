import java.util.Scanner;

public class Exercise04_26 {
  public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount 
    System.out.print(
      "Enter an amount in double, for example, 11.56: ");
    String amount = input.next();
    int dollars = Integer.valueOf(amount.substring(0,2));
    int cents = Integer.valueOf(amount.substring(3));

    // Find the number of one dollars
    int numberOfOneDollars = dollars;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = cents / 25;
    cents = cents % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = cents / 10;
    cents = cents % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = cents / 5;
    cents = cents % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = cents;

    // Display results
    System.out.println("Your amount " + amount + " consists of"); 
    System.out.println("    " + numberOfOneDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes"); 
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
    
    input.close();
  }
}