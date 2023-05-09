import java.util.Arrays;
import java.util.Scanner;
public class Exercise07_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size = input.nextInt();
		int[] numbers = new int[size];
		System.out.printf("Enter %d integers: ", size);
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.printf("The list has %d integers %s%n", size, Arrays.toString(numbers));
		if (isSorted(numbers)) {
			System.out.print("The list is already sorted.");
		}
		else {System.out.print("The list is not sorted.");}
		input.close();
	}
	
	public static boolean isSorted(int[] list) {
		int[] temp = new int[list.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = list[i];
		}
		Arrays.sort(list);
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == list[i]) {
				count++;
			}
			if (count == temp.length) {
				return true;
			}
		}
		return false;
	}
}
