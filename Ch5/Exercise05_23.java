
public class Exercise05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_VALUE = 50000;
		double sum = 0;
		for(int n=1; n <= MAX_VALUE; n++) {
			sum += 1.0/n;
		}
		System.out.println("Computing from left to right: " + sum);
		sum=0;
		for( int n=MAX_VALUE; n >= 1; n--) {
			sum += 1.0/n;
		}
		System.out.println("Computing from right to left: " + sum);
		
	}

}
