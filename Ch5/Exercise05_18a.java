
public class Exercise05_18a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 6;
		for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
			for (int number = 1; number <= lineNumber; number++) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}

}
