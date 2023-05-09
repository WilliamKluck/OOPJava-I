import java.util.Scanner;
public class Exercise03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int computer;
		String computerWord = "";
		String humanWord = "";
		int humanWin = 0;
		int computerWin = 0;
		
		while (humanWin <=2 && computerWin <=2) {
			computer = (int)(Math.random() * 3);
			System.out.print("scissors (0), rock (1), paper (2): ");
			int human = input.nextInt();
			switch(computer) {
				case 0: computerWord = "scissors"; break;
				case 1: computerWord = "rock"; break;
				case 2: computerWord = "paper"; break;
			}
			switch(human) {
				case 0: humanWord = "scissors"; break;
				case 1: humanWord = "rock"; break;
				case 2: humanWord = "paper"; break;
				default: System.out.println("Incorrect input");
				System.exit(1);
			}
			
			if (computer == human) {
				System.out.println("The computer is " + computerWord + ". You are " + humanWord + " too. It is a draw.");
				computerWin = 0;
				humanWin = 0;
			}
			else if (computer == 1 && human == 2
					|| computer == 0 && human == 1
					|| computer == 2 && human == 0) {
				System.out.println("The computer is " + computerWord + ". You are " + humanWord + ". You win.");
				humanWin++;
				computerWin = 0;
				
			}
			else {
				System.out.println("The computer is " + computerWord + ". You are " + humanWord + ". You lose.");
				computerWin++;
				humanWin = 0;
			}
		}
		if(humanWin == 3) {
			System.out.println("YOU WIN THE SERIES!");
		}
		else {
			System.out.println("YOU LOSE THE SERIES!");
		}
		input.close();
	}

}
