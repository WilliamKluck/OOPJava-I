import java.util.Scanner;

public class Exercise05_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.printf("Enter the day of the week on January 1st, %d: ", year);
		int dayOfWeek = input.nextInt();
		int dayOfMonth = 0;
		String nameOfMonth = "";
		int day=0;
		
		
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		for(int month=1; month<=12; month++) {
			switch(month) {
			case 1: nameOfMonth = "January"; break;
			case 2: nameOfMonth = "February"; break;
			case 3: nameOfMonth = "March"; break;
			case 4: nameOfMonth = "April"; break;
			case 5: nameOfMonth = "May"; break;
			case 6: nameOfMonth = "June"; break;
			case 7: nameOfMonth = "July"; break;
			case 8: nameOfMonth = "August"; break;
			case 9: nameOfMonth = "September"; break;
			case 10: nameOfMonth = "October"; break;
			case 11: nameOfMonth = "November"; break;
			case 12: nameOfMonth = "December"; break;
			}
			dayOfWeek = (dayOfWeek + dayOfMonth)%7; 
			dayOfMonth=0;
			switch(month) {
			case 1:
			case 3: 
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: day=31;
			dayOfMonth += 31; break;
			case 4:
			case 6:
			case 9:
			case 11: day=30;
			dayOfMonth += 30; break;
			case 2: 
				if (isLeapYear) {
					day=29;
				dayOfMonth += 29;
				}
				else {
					day=28;
					dayOfMonth += 28;
				} break;
			}
			System.out.printf("%s %d%n", nameOfMonth, year);
			System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s %s%n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
			for(int space = dayOfWeek; space>0; space--) {
				System.out.printf("%-6s", " " );
			}
			for(int count = 1; count <= day; count++) {
				System.out.printf("%-6d", count);
				if((count + dayOfWeek) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		input.close();
	}

}
