
public class Exercise05_18c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 6;
		for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
			for (int space = 0; space <= (numberOfLines - lineNumber) * 2; space++) {
				System.out.print(" ");
			}
			for (int number = lineNumber; number >= 1; number--) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}

}
