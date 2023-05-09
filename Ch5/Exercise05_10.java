
public class Exercise05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tenPerLine = 0;
		for(int i = 100; i < 1001; i++) {
			if (tenPerLine == 10) {
				System.out.printf("%n");
				tenPerLine = 0;
			}
			if (i % 5 == 0 || i % 6 == 0) {
				tenPerLine++; 
				System.out.printf("%d ", i);
			}
		}
	}

}
