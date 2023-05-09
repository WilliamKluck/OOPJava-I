import java.util.Scanner;
public class Exercise02_08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");
		System.out.print("Enter the time zone offset to GMT: ");
		long offset = input.nextLong();
		long adjustedHour = (currentHour + offset) % 24;
		System.out.println("Current time is " + adjustedHour + ":"
				+ currentMinute + ":" + currentSecond);
		input.close();
	}
}
