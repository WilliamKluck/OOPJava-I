import java.util.Scanner;
public class Exercise07_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] number = new int[5];
		
	}
	
	public static int getRandom(int[] numbers) {
		int random;
		boolean isValid;
		do {
			random = (int)(Math.random() * 55);
			isValid = true;
		for(int i = 0; i < numbers.length; i++) {
			if(random == numbers[i]) {
				isValid = false;
			}
		}
		}while (isValid == false);
		return random;
	}
}
