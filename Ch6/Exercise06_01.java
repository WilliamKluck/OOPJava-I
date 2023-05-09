
public class Exercise06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PERLINE = 10;
		int count = 0;
		for(int number = 1; number <= 100; number++) {
			System.out.printf("%d ", getPentagonalNumber(number));
			count++;
			if (count == PERLINE) {
				System.out.println();
				count=0;
			}
		}
	}

	public static int getPentagonalNumber(int n) {
		return (n * ((3 * n)- 1)) / 2;
	}
}
