import java.util.Scanner;
public class Exercise03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int coinflip = (int)(Math.random() * 2);
		System.out.print("Heads or Tails? ");
		String guess = input.next();
		
		if (coinflip == 1) {
			System.out.println("Heads");
			if (guess.toUpperCase().equals("HEADS")) {
				System.out.println("You are correct!");
			}
			else if (guess.toUpperCase().equals("TAILS")) {
				System.out.println("You are incorrect!");
			}
			else {
				System.out.println("Incorrect input");
			}
		}
		else {
			System.out.println("Tails");
			if (guess.toUpperCase().equals("HEADS")) {
				System.out.println("You are incorrect!");
			}
			else if (guess.toUpperCase().equals("TAILS")) {
				System.out.println("You are correct!");
			}
			else {
				System.out.println("Incorrect input");
			}
		}
		input.close();
	}

}
