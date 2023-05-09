import java.util.Scanner;
public class Exercise03_30 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//generate time
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		//input time zone
		System.out.print("Enter the time zone offset to GMT: ");
		long offset = input.nextLong();
		long adjustedHour = (currentHour + offset) % 24;
		
	
		if (adjustedHour < 1) { //find 12AM
			adjustedHour = 12; 
			System.out.println("Current time is " + adjustedHour + ":"
					+ currentMinute + ":" + currentSecond + " AM");
		}
		else if (adjustedHour > 12) { //find 1-11PM
			adjustedHour = adjustedHour % 12;
			System.out.println("Current time is " + adjustedHour + ":"
					+ currentMinute + ":" + currentSecond + " PM");
		}
		else if (adjustedHour > 11) { //find 12PM
			System.out.println("Current time is " + adjustedHour + ":"
					+ currentMinute + ":" + currentSecond + " PM");
		}
		else { //find 1-11AM
			System.out.println("Current time is " + adjustedHour + ":"
					+ currentMinute + ":" + currentSecond + " AM");
		}
		
		input.close();
	}
}
