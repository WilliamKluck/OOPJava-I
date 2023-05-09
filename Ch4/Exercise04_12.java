import java.util.Scanner;

public class Exercise04_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a hex digit: ");
    String hexString = input.nextLine();
    
    // Check if the hex string has exactly one character
    if (hexString.length() != 1) {
      System.out.println("You must enter exactly one character");
      System.exit(1);
    }
    int value = 0;
    
    //decimal value for the hex digit
    char ch = Character.toUpperCase(hexString.charAt(0));    
    if ('A' <= ch && ch <= 'F') {
      value = ch - 'A' + 10;
    }
    else if (Character.isDigit(ch)) {
      value = ch;
    }
    else {
      System.out.println(ch + " is an invalid input");
    }
    
    //binary value for the decimal
    int binarydigit1 = 0;
    int binarydigit2 = 0;
    int binarydigit3 = 0;
    int binarydigit4 = 0;
    if (value % 2 == 1) {
    	binarydigit1 = 1;
    }
    value = value / 2;
    if (value % 2 == 1) {
    	binarydigit2 = 1;
    }
    value = value / 2;
    if (value % 2 == 1) {
    	binarydigit3 = 1;
    }
    value = value / 2;
    if (value % 2 == 1) {
    	binarydigit4 = 1;
    }
    
    System.out.printf("The binary value is %d%d%d%d", binarydigit4, binarydigit3, binarydigit2, binarydigit1);
    
    input.close();
  }
}