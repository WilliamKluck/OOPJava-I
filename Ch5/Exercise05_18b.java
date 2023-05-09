
public class Exercise05_18b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 6;
		for (int lineNumber = numberOfLines; lineNumber >= 1; lineNumber--) {
			for (int number = 1; number <= lineNumber; number++) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}

}
