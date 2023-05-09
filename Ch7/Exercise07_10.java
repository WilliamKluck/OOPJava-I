import java.util.Scanner;

public class Exercise07_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		double[] array = new double[10];
		System.out.print("Enter 10 double values: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.printf("The index of the minimal value is %d", indexOfSmallestElement(array));
		input.close();
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min = array[0]; 
		int index = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
}
