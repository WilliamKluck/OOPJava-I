//StopWatch class
public class Exercise09_06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch stopwatch = new StopWatch();
		
		int[] randomArray = getArray();
		
		stopwatch.start();
		
		java.util.Arrays.sort(randomArray);
		
		stopwatch.stop();
		
		System.out.println("The elapsedTime is: " + stopwatch.getElapsedTime() + "ms");
		
	}

	public static int[] getArray() {
		// Create an array of length 100,000
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100000);
		}
		return array;
	}
}

class StopWatch{

	private long startTime;
	private long endTime;
	
	public StopWatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
	
}
