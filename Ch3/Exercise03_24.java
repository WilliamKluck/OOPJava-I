
public class Exercise03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suit = (int)(Math.random() * 4);
		int value = (int)(Math.random() * 13);
		String suitName = "";
		if (value == 0) {
			value = 13;
		}
		
		switch (suit) {
		case 0: suitName = "Hearts"; break;
		case 1: suitName = "Diamonds"; break;
		case 2: suitName = "Clubs"; break;
		case 3: suitName = "Spades"; break;
		}
		
		if (value > 1 && value < 11) {
			System.out.println("The card you picked is the " + value + " of " + suitName);
			
		}
		else {
			String valueName = "";
			switch (value) {
			case 1: valueName = "Ace"; break;
			case 11: valueName = "Jack"; break;
			case 12: valueName = "Queen"; break;
			case 13: valueName = "King"; break;
			}
			System.out.println("The card you picked is the " + valueName + " of " + suitName);
		}
	}

}
