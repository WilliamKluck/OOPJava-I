import java.util.*;

public class Exercise08_11 {

  public static void main(String[] args) {
    System.out.print("Enter a number between 0 and 511: ");
    Scanner input = new Scanner(System.in);
    short number = input.nextShort();

    String s = dec2Binary(number); System.out.println(s);
    char[][] m = string2Array(s);
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++)
            System.out.print(m[i][j] + " ");
      System.out.println();
    }
    input.close();
  }

  public static String dec2Binary(short number) {
    String result = "";

    while (number != 0) {
      if (number % 2 == 0) {
          result = '0' + result;
      } else {
          result = '1' + result;
      }
      number /= 2;
    }
    
    int size = result.length();
    for (int i = 0; i < 9 - size; i++)
        result = '0' + result;

    return result;
  }
  
  public static char[][] string2Array(String s) {
    char[][] result = new char[3][3];

    for (int i = 0; i < s.length(); i++) {
      result[i / 3][i % 3] = s.charAt(i) == '0' ? 'H' : 'T';
    }

    return result;
  }  
}

