import java.util.Scanner;
public class Exercise05_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.printf("Enter the day of the week on January 1st, %d: ", year);
		int dayOfWeek = input.nextInt();
		int dayOfMonth = 0;
		String nameOfDay = "";
		String nameOfMonth = "";
		
		
		
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
			case 12: dayOfMonth += 31; break;
			case 4:
			case 6:
			case 9:
			case 11: dayOfMonth += 30; break;
			case 2: 
				if (isLeapYear) {
				dayOfMonth += 29;
				}
				else {
					dayOfMonth += 28;
				} break;
			}
			switch(dayOfWeek) {
			case 0: nameOfDay = "Sunday"; break;
			case 1: nameOfDay = "Monday"; break;
			case 2: nameOfDay = "Tuesday"; break;
			case 3: nameOfDay = "Wednesday"; break;
			case 4: nameOfDay = "Thursday"; break;
			case 5: nameOfDay = "Friday"; break;
			case 6: nameOfDay = "Saturday"; break;
			}
			System.out.printf("%s 1, %d is %s%n", nameOfMonth, year, nameOfDay);
		}
		input.close();
		
	}

}
