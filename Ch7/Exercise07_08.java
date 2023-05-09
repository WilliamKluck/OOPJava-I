import java.util.Scanner;
public class Exercise07_08 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//int[] valuesInt = initializeArrayI();
		//int avgInt = average(valuesInt);
		//System.out.printf("The average is %.2f%n", avgInt*1.0 / valuesInt.length);
		double[] valuesDub = initializeArrayD();
		double avgDub = average(valuesDub);
		System.out.printf("The average is %.2f%n", avgDub);
	}
	
	public static int[] initializeArrayI() {
		final int SIZE = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int[] values = new int[SIZE];
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextInt();
		}
		input.close();
		return values;
	}
	
	public static double[] initializeArrayD() {
		final int SIZE = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 double values: ");
		double[] values = new double[SIZE];
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}
		input.close();
		return values;
	}
	
	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static double average(double[] array) {
		double average = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average = sum / array.length;
		return average;
	}
	

}
