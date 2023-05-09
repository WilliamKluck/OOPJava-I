import java.util.Scanner;
public class Exercise04_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if (city1.charAt(0) > city2.charAt(0)) {
			String swap = city1;
			city1 = city2;
			city2 = swap;
		}
		
		if (city2.charAt(0) > city3.charAt(0)) {
			String swap = city2;
			city2 = city3;
			city3 = swap;
		}
		
		if (city1.charAt(0) > city2.charAt(0)) {
			String swap = city1;
			city1 = city2;
			city2 = swap;
		}
		
		System.out.printf("The 3 cities in alphabetical order are %s, %s, and %s", city1, city2, city3);
		
		input.close();
		
	}

}
