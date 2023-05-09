import java.util.Scanner;
public class Exercise04_17 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String monthName = input.next();
		int monthNum = 0;
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		
		if (monthName.equals("Jan")) {
			monthNum = 1;
		}
		else if (monthName.equals("Feb")) {
			monthNum = 2;
		}
		else if (monthName.equals("Mar")) {
			monthNum = 3;
		}
		else if (monthName.equals("Apr")) {
			monthNum = 4;
		}
		else if (monthName.equals("May")) {
			monthNum = 5;
		}
		else if (monthName.equals("Jun")) {
			monthNum = 6;
		}
		else if (monthName.equals("Jul")) {
			monthNum = 7;
		}
		else if (monthName.equals("Aug")) {
			monthNum = 8;
		}
		else if (monthName.equals("Sep")) {
			monthNum = 9;
		}
		else if (monthName.equals("Oct")) {
			monthNum = 10;
		}
		else if (monthName.equals("Nov")) {
			monthNum = 11;
		}
		else if (monthName.equals("Dec")) {
			monthNum = 12;
		}
		else {
			monthNum = 13;
		}
		
		switch(monthNum) {
		case 13: System.out.println(monthName + " is not a month name"); break;
		case 1:
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println(monthName + " " + year
				+ " has 31 days"); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println(monthName + " " + year
				+ " has 30 days"); break;
		case 2: if (isLeapYear) {
			System.out.println(monthName + " " + year
					+ " has 29 days");
		}
		else {
			System.out.println(monthName + " " + year
					+ " has 28 days");
		} break;
		}
		input.close();
		}
}
