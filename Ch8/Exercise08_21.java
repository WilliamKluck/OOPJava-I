import java.util.Scanner;
public class Exercise08_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numberOfCities = determineCities(input);
		
		double[][] distanceCities = determineLocation(input, numberOfCities);
		
		double[] centerCity = computeTotalDistance(distanceCities);
		
		displayOutput(centerCity);
	}
	
	public static int determineCities(Scanner input) {
		System.out.print("Enter the number of cities: ");
		int cities = input.nextInt();
		return cities;
	}
	
	public static double[][] determineLocation(Scanner input, int amount){
		System.out.print("Enter the coordinates of the cities: ");
		double[][] cities = new double[amount][3];
		for (int i = 0; i < cities.length; i++) {
			cities[i][0] = input.nextDouble();
			cities[i][1] = input.nextDouble();
		}
		return cities;
	}
	
	public static double[] computeTotalDistance(double[][] location) {
		
		for (int i = 0; i < location.length; i++) {
			for (int j = 0; j < location.length; j++) {
				location[i][2] += distance(location[i][0], location[i][1], location[j][0], location[j][1]);
			}
		}
		
		double[] shortestTotalLength = new double[3];
		shortestTotalLength[2] = location[0][2];
		for (int i = 0; i < location.length; i++) {
			if (shortestTotalLength[2] >= location[i][2]) {
				for (int j = 0; j < 3; j++) {
					shortestTotalLength[j] = location[i][j];
				}
			}
		}
		return shortestTotalLength;
	}
	
	public static double distance(
		      double x1, double y1, double x2, double y2) {
		    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		  }
	
	public static void displayOutput(double[] m) {
		System.out.println("The central city is at (" + m[0] + ", " + m[1] + ")");
		System.out.println("The total distance to all other cities is : " + m[2]);
	}
}
