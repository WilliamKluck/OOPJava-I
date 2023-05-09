
public class Exercise06_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", "Year", "Days");
		for (int year = 2000; year <= 2020; year++) {
			System.out.printf("%d %d%n", year, numberOfDaysInAYear(year));
		}
	}
	public static int numberOfDaysInAYear(int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		if (isLeapYear) {
			return 366;
		}
		else {
			return 365;
		}
	}
}
