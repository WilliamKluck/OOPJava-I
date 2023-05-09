import java.util.Scanner;
public class Exercise07_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] list = new double[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextDouble();
		}
		list = reverse(list);
		
		System.out.println("The reversal of the input is: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
		}
		input.close();
	}

	public static double[] reverse(double[] list) {
		double temp;
		for (int i = 0; i < list.length/2; i++) {
			temp = list[i];
			list[i] = list[list.length-1-i];
			list[list.length-1-i] = temp;
		}
		
		return list;
		}
}
