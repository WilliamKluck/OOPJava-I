
public class Exercise06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%3s %8s%n", "i", "m(i)");
		for (int i = 1; i< 1000; i += 100) {
			System.out.printf("%3d %8.4f%n", i, sumSeries(i));
		}
	}
	public static double sumSeries(int i) {
		double sum = 0;
		for (; i > 0; i--) {
			sum += Math.pow(-1, i+1) / (2*i-1.0);
		}
		return sum * 4;
	}
}
