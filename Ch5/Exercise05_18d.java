
public class Exercise05_18d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 6;
		for(int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
			for (int space = 0; space < (lineNumber-1) * 2; space++) {
				System.out.print(" ");
			}
			for (int number = lineNumber; number <= numberOfLines; number++) {
				System.out.printf("%d ", number);
			}
			System.out.println();
		}
	}

}
