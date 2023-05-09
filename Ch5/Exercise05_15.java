
public class Exercise05_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tenPerLine = 0;
		for(int i = 33; i < 127; i++) {
			if (tenPerLine == 10) {
				System.out.printf("%n");
				tenPerLine = 0;
			}
			System.out.printf("%c ", (char)i);
			tenPerLine++;
			}
	}

}
