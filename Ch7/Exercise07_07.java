
public class Exercise07_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] random = initializeArray();
		int[] count = countOneToNine(random);
		displayArray(count);
	}
	
	public static int[] initializeArray() {
		final int SIZE = 50;
		
		int[] random = new int[SIZE];
		for (int i = 0; i<random.length; i++) {
			int randomNumber = (int)(Math.random() * 10);
			random[i] = randomNumber;
		}
		return random;
	}
	
	public static int[] countOneToNine(int[] random) {
		int[] count = new int[10];
		int number = 0;
		for(int i = 0; i<random.length; i++) {
			number = random[i];
			count[number]++;
		}
		return count;
		
	}
	
	public static void displayArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
}
