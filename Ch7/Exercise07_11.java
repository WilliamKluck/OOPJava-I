import java.util.Scanner;
public class Exercise07_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		double mean = mean(array);
		double deviation = deviation(array);
		
		System.out.printf("The mean is %.2f%n"
				+ "The deviation is %f", mean, deviation);
		input.close();
	}
	
	public static double deviation(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += Math.pow((x[i] - mean(x)), 2);
		}
		return Math.sqrt(sum / (x.length-1));
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
}
