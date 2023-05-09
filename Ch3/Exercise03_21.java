import java.util.Scanner;
public class Exercise03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year (eg. 2008): ");
		int year = input.nextInt();
		
		System.out.print("Enter the month (1-12): ");
		int m = input.nextInt();
		
		if (m == 1 || m == 2) {
			m = (m == 1) ? 13 : 14;
			year--;
		}
		int j = year / 100;
		int k = year % 100;
		
		System.out.print("Enter the day of the month (1-31): ");
		int q = input.nextInt();
		
		int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String date = "";
		switch (h) {
		case 0: date = "Saturday"; break;
		case 1: date = "Sunday"; break;
		case 2: date = "Monday"; break;
		case 3: date = "Tuesday"; break;
		case 4: date = "Wednesday"; break;
		case 5: date = "Thursday"; break;
		case 6: date = "Friday"; break;
		}
		
		System.out.println("The day of the week is " + date);
		input.close();
		
	}

}
