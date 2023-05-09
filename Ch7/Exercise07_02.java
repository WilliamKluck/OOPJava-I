import java.util.Scanner;
public class Exercise07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("Enter 10 integers: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		reverseArray(a);
		printArray(a);
		
		input.close();
	}
	
	public static void reverseArray(int[] a) {
		int temp;
		for (int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length ; i++) {
			System.out.print(a[i]);
		}
	}

}
