import java.util.Scanner;
public class Exercise06_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long totalMilliseconds = input.nextLong();
		System.out.print(convertMillis(totalMilliseconds));
		input.close();
	}
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		return "" + totalHours + ":" + currentMinute + ":" + currentSecond;
	
	}
}