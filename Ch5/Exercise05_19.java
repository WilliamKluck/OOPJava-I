
public class Exercise05_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfLines = 8;
		for (int lineNumber = 1; lineNumber <= numberOfLines; lineNumber++) {
			for (int space = 1; space <= (numberOfLines - lineNumber) * 4; space++) {
				System.out.print(" ");
			}
			for (int number = (int)Math.pow(2, 0); number <= Math.pow(2, lineNumber - 1); number *= 2) {
				System.out.printf("%3d ", number);
			}
			for (int number = (int)Math.pow(2, lineNumber-2); number >= Math.pow(2, 0); number /= 2) {
				System.out.printf("%3d ", number);
			}
			System.out.println();
		}
		
	}

}
