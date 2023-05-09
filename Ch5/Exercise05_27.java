
public class Exercise05_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tenPerLine = 0;
		int numberOfLeapYears = 0;
		for (int year = 101; year <=2100; year++) {
			
			boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
			if(isLeapYear) {
				tenPerLine++;
				numberOfLeapYears++;
				System.out.print(year + " ");
				if (tenPerLine == 10){
					System.out.println();
					tenPerLine = 0;
				}
			
			}
		}
		System.out.printf("The number of Leap Years is: %d", numberOfLeapYears);
	}
}
