import java.util.Scanner;
public class Exercise02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		final int MINUTESINDAY = 60 * 24;
		long days = minutes / MINUTESINDAY;
		final int DAYSINYEAR = 365;
		long years = days / DAYSINYEAR;
		days = days % DAYSINYEAR;
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		input.close();
	}

}
