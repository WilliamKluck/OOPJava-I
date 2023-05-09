import java.util.Scanner;

public class Exercise03_15 {
  public static void main(String[] args) {
    // Generate a lottery
    int lottery = (int)(Math.random() * 1000);
    
    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();

    // Get digits from lottery
    int lotteryDigit1 = lottery % 10;
    int lotteryDigit2 = lottery / 10 % 10 ;
    int lotteryDigit3 = lottery / 100;

    // Get digits from guess
    int guessDigit1 = guess % 10;
    int guessDigit2 = guess / 10 % 10;
    int guessDigit3 = guess / 100;
    

    System.out.println("The lottery number is " + lottery);
    System.out.println("The digits are " + lotteryDigit1 + " " + lotteryDigit2 + " " + lotteryDigit3);
    System.out.println("The guesses are" + guessDigit1 + " " + guessDigit2 + " " + guessDigit3);

    // Check the guess
    if (//123
    		guess == lottery)
      System.out.println("Exact match: you win $10,000");
    else if (//132 213 231 312 321
    		   (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit2)
    		|| (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3)
    		|| (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit3 && lotteryDigit3 == guessDigit1)
    		|| (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)
    		|| (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1))
      System.out.println("Match all digits: you win $3,000");
    else if (//100 010 001 200 020 002 300 030 003
    		//120 
    		guessDigit1 == lotteryDigit1 
          || guessDigit1 == lotteryDigit2
          || guessDigit1 == lotteryDigit3
          || guessDigit2 == lotteryDigit1 
          || guessDigit2 == lotteryDigit2
          || guessDigit2 == lotteryDigit3
          || guessDigit3 == lotteryDigit1
          || guessDigit3 == lotteryDigit2
          || guessDigit3 == lotteryDigit3)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match"); 
    
    input.close();
  }
}