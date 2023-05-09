
public class Exercise05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 12000) {
			int squared = (int)Math.pow(i, 2);
			if (squared > 12000) {
				break;
			}
			else {
				i++;
			}
		}
		System.out.printf("%d is the smallest number that when squared is greater than 12,000", i);
	}

}
