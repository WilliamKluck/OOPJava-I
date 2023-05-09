
public class Exercise06_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long currentMillis = System.currentTimeMillis();
		
		//The output looks like this
		System.out.printf("The current date and time is %s %s", Date(currentMillis), Time(currentMillis));
		
	}
	
	//finds the current date
	public static String Date(long currentMillis) {
		String hoursMinutesSeconds = convertMillis(currentMillis); //start with time condensed into hours
		long hours = Long.parseLong(hoursMinutesSeconds.substring(0, hoursMinutesSeconds.length()-6)); //seperate hours from min/sec
		String yearsRemainingHours = convertHoursToYears(hours); //returns the year AND how many hours up to the end of this current year
		long hours1970ToYearEnd = Long.parseLong(yearsRemainingHours.substring(5)); //seperates out the hours from 1970 to end of year
		int year = Integer.parseInt(yearsRemainingHours.substring(0, 4)); //seperates out the year
		long hoursCurrentYear = hoursCurrentYear(year); //finds the amount of hours in this year
		long hoursLeftInYear = hours1970ToYearEnd - hours; //finds the amount of hours till the end of the year
		long currentHourOfYear = hoursCurrentYear - hoursLeftInYear; //finds the elapsed hours this year
		String dayOfWeek = dayOfWeek(hours); //finds the day of the week
		int month = month(currentHourOfYear, year); //outputs the month in integer
		long hoursLeftInMonth = hoursMonth(currentHourOfYear, year, month); //computes how many hours have elapsed this month
		int day = day(hoursLeftInMonth); //sends back the day of the month
		return dayOfWeek + ", " + month + "/" + day + "/" + year; //Ex: Wednesday, 11/3/2021 
	}
	
	//finds the current time GMT
	public static String Time(long currentMillis) {
		String hoursMinutesSeconds = convertMillis(currentMillis);
		long hours = Long.parseLong(hoursMinutesSeconds.substring(0, hoursMinutesSeconds.length()-6));
		hours = hours % 24;// finds hour in day
		return " " + hours + hoursMinutesSeconds.substring(hoursMinutesSeconds.length()-6)+ "GMT"; //00:00:00
		
	}
	
	//basically exercise 06_25
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		if (currentSecond < 10 && currentMinute < 10) {
			return "" + totalHours + ":0" + currentMinute + ":0" + currentSecond;
		}
		else if (currentSecond < 10) {
			return "" + totalHours + ":" + currentMinute + ":0" + currentSecond;
		}
		else if (currentMinute < 10){
			return "" + totalHours + ":0" + currentMinute + ":" + currentSecond;
		}
		
		return "" + totalHours + ":" + currentMinute + ":" + currentSecond;
	}
	
	
	public static String convertHoursToYears(long hours) {
		long temp = hours;
		long sum = 0;
		int year;
		for (year = 1970; sum <= temp; year++) {
			if (isLeapYear(year)) {
				sum += 24 * 366;
			}
			else {
				sum += 24 * 365;
			}
		}
		return "" + (--year) + ":" + sum;
	}
	
	public static long hoursCurrentYear(long year) {
		if(isLeapYear(year)) {
			return 24 * 366;
		}
		else {
			return 24 * 365;
		}
	}
	
	public static String dayOfWeek(long hours) {
		//Jan 1 1970 was a Thursday
		int days = dayCount(hours);
		int day = (4 + days) % 7;
		switch(day) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		default: return "Unknown DayOfWeek";
		}
	}
	
	public static int dayCount(long hours) {
		int dayCount = (int)hours / 24;
		return dayCount;
	}
	
	public static int month(long currentHourOfYear, long year) {
		int day = dayCount(currentHourOfYear);
		int monthCount;
		for (monthCount = 1; day > 0; monthCount++) {
			switch(monthCount) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: day = day - 31; break;
			case 4:
			case 6:
			case 9:
			case 11: day = day - 30; break;
			case 2: if (isLeapYear(year)) {
				day = day - 29;
			}
			else {
				day = day - 28;
			}
			}
		}
		return monthCount-1;
	}
	
	public static long hoursMonth(long currentHourOfYear, long year, int month) {
		long sum = 0;
		for (int monthCount = 1; monthCount < month; monthCount++) {
			switch(monthCount) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: sum += 24 * 31; break;
			case 4:
			case 6:
			case 9:
			case 11: sum += 24 * 30; break;
			case 2: if (isLeapYear(year)) {
				sum += 24 * 29;
			}
			else {
				sum += 24 * 28;
			}
			}
			
		}
			
		return (currentHourOfYear - sum);
	}
	
	public static int day(long hoursLeftInMonth) {
		return (int)(hoursLeftInMonth / 24) + 1;
	}
	public static boolean isLeapYear(long year) {
		  boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		  return isLeapYear;
	}
	
}