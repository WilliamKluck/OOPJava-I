import java.util.Scanner;
public class Exercise07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
		System.out.print("Enter 10 double values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.printf("The minimum value is %.2f", min(array));
		input.close();
	}
	
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
