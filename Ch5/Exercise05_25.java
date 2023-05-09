
public class Exercise05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		int maxValue = 100000;
		for(int value = 10000; value <= maxValue; value += 10000) {
		for(int i = 1; i <= value; i++){
			pi += Math.pow(-1, i+1)/(2 * i - 1);
		}
		System.out.printf("i: %d The PI is %.16f%n", value, pi * 4);
		pi = 0;
		}
	}

}
