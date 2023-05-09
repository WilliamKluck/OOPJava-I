
public class Exercise05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s %8s%n", "Miles", "Kilometers");
		for (int mi = 1; mi<=10; mi++ ) {
			double km = 1.609 * mi;
			System.out.printf("%-12d %8.3f%n", mi, km);
			
			
		}
	}

}
