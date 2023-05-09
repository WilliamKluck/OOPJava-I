import java.util.Scanner;
public class Exercise03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month in the year (eg., 1 for January): ");
		int monthNum = input.nextInt();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		String monthStr = "";
		
				if (monthNum > 12) {
					year += (monthNum / 12);
				}
				
				boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				
		switch(monthNum % 12) {
		case 0: monthStr = "December";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 1: monthStr = "January";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 2: monthStr = "February"; 
				if(isLeapYear) {
					System.out.println(monthStr + " " + year + " is 29 days");
				}
				else{
					System.out.println(monthStr + " " + year + " is 28 days");
				}
				break;
		case 3: monthStr = "March";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 4: monthStr = "April"; 
				System.out.println(monthStr + " " + year + " is 30 days");break;
		case 5: monthStr = "May";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 6: monthStr = "June";
				System.out.println(monthStr + " " + year + " is 30 days"); break;
		case 7: monthStr = "July";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 8: monthStr = "August";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 9: monthStr = "September";
				System.out.println(monthStr + " " + year + " is 30 days"); break;
		case 10: monthStr = "October";
				System.out.println(monthStr + " " + year + " is 31 days"); break;
		case 11: monthStr = "November"; 
				System.out.println(monthStr + " " + year + " is 30 days"); break;
		}
		
		input.close();
	}

}
