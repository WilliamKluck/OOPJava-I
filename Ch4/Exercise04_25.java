
public class Exercise04_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = (int) (Math.random() * (91 - 65)) + 65;
		int r2 = (int) (Math.random() * (91 - 65)) + 65;
		int r3 = (int) (Math.random() * (91 - 65)) + 65;
		int number = (int) (Math.random() * 10000);
		
		System.out.printf("A random vehicle license plate number is %c%c%c%04d", r1, r2, r3, number);
	}

}
