
public class Exercise06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char startingChar = '1';
		char endingChar = 'Z';
		int numberPerLine = 10;
		printChars(startingChar, endingChar, numberPerLine);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for (int i = (int)ch1; i <= ch2; i++) {
			count++;
			System.out.printf("%c ", i);
			if(count == numberPerLine) {
				count = 0;
				System.out.println();
			}
		}
	}
}
