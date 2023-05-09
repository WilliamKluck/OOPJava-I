
public class Exercise05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 12000) {
			int cubed = (int)Math.pow(i, 3);
			if (cubed > 12000) {
				i--;
				break;
			}
			else {
				i++;
			}
		}
		System.out.printf("%d is the largest number that when cubed is less than 12,000", i);
	}

}
